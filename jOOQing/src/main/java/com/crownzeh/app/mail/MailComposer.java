package com.crownzeh.app.mail;

import my.db.public_.Tables;
import org.jooq.Record;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Calendar;

    class MailComposer {

    MimeMessage compose(Session session, Record record) throws MessagingException {

        String recipient;
        String body;
        String header;
        recipient = record.getValue(Tables.USERS.EMAIL);
        header = ("Twój plan na dziś, " + record.getValue(Tables.USERS.NAME));
        body = composeBody(record);
        MimeMessage message= new MimeMessage(session);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
        message.setSubject(header);
        message.setText(body);
        return message;
    }

    private String composeBody(Record r){
        String day = "";
        StringBuilder builder = new StringBuilder("");
        builder.append("Cześć, ").append(r.getValue(Tables.USERS.NAME));
        builder.append(" ").append(r.getValue(Tables.USERS.LASTNAME)).append("!");
        switch(Calendar.DAY_OF_WEEK){
            case Calendar.MONDAY: day = "poniedziałek";
            break;
            case Calendar.TUESDAY: day = "wtorek";
            break;
            case Calendar.WEDNESDAY: day = "środa";
            break;
            case Calendar.THURSDAY: day = "czwartek";
            break;
            case Calendar.FRIDAY: day = "piątek";
            break;
            case Calendar.SATURDAY: day = "sobota";
            break;
            case Calendar.SUNDAY: day = "niedziela";
            break;
        }
        builder.append("\n\nDziś jest ").append(day);
        builder.append("\ngeneric text");
        builder.append("\ngeneric text");
        builder.append("\ngeneric text");
        builder.append("\ngeneric text");
        builder.append("\n\nMiłego treningu życzy TeamCrownzeh :)");
        return builder.toString();
    }


}