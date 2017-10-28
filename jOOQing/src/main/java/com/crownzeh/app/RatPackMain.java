package com.crownzeh.app;

import com.crownzeh.app.mail.MailComposer;
import com.crownzeh.app.task.CustomTimerTask;
import ratpack.server.RatpackServer;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class RatPackMain {
    public static void main(String... args) throws Exception {
        RatpackServer.start(server -> server
                .handlers(chain -> chain
                        .get(ctx -> ctx.render("dupa"))
                        .get(":name", ctx -> ctx.render("Hello " + ctx.getPathTokens().get("name") + "!"))
                )
        );
        Connection connection = DatabaseConnector.connectToDatabse();
        //ProxySender mailSender = new ProxySender();
        MailComposer mailComposer = new MailComposer(connection);
        mailComposer.printUsers();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
            calendar.add(Calendar.DATE, 1);
        }
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println("Task zostanie wykonany: " + sdf.format(calendar.getTime()));
        CustomTimerTask ctt = new CustomTimerTask();
        Timer timer = new Timer(true);
        timer.schedule(ctt, calendar.getTime());
    }
}

