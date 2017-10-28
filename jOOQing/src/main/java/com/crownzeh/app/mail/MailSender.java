package com.crownzeh.app.mail;

public interface MailSender {
    void sendMail(String recipient, String header, String body);
}

