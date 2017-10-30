package com.crownzeh.app.mail;

public class ProxySender implements MailSender {

    private RealSender realSender;

    public ProxySender() {
    }

    @Override
    public void sendToAll() {
        if (realSender == null) {
            realSender = new RealSender();
        }
        realSender.sendToAll();

    }


}
