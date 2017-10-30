package com.crownzeh.app.mail;

import com.crownzeh.app.DatabaseConnector;
import my.db.public_.Tables;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import java.util.Properties;

public class RealSender implements MailSender {

    private final String SENDER;
    private final String USERNAME;
    private final String PASSWORD;
    private final String HOST;
    private final String PORT;
    private final Session session;

    RealSender() {

        SENDER = "current.workout@gmail.com";
        USERNAME = "current.workout";
        PASSWORD = "workoutpass123";
        HOST = "smtp.gmail.com";
        PORT = "587";
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", PORT);
        session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(USERNAME, PASSWORD);
                    }
                });

    }

    @Override
    public void sendToAll() {
        try {
            DatabaseConnector.connectToDatabse();
            DSLContext create = DSL.using(DatabaseConnector.getConnection(), SQLDialect.POSTGRES_9_3);
            MailComposer composer = new MailComposer();
            Result<Record> result = create.select().from(Tables.USERS).fetch();
            for (Record r : result) {
                Message message = composer.compose(session, r);
                message.setFrom(new InternetAddress(SENDER));
                Transport.send(message);
                System.out.println("Mail sent successfully to " + r.getValue(Tables.USERS.EMAIL) + "!");
            }
        } catch (MessagingException e) {
            System.out.println("Something's fucked up, sorry");
            throw new RuntimeException(e);
        }
        DatabaseConnector.closeConnection();
    }



}