package com.crownzeh.app.mail;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class RealSender implements MailSender{
	
	private final String SENDER;
    private final String USERNAME;
    private final String PASSWORD;
    private final String HOST;
    private final String PORT;
    private final Session session;
	
	public RealSender(){
		
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
	public void sendMail(String recipient, String header, String body){
	     try {	
	    	    recipient = "jakub.krzetowski@gmail.com";
	    	   	Message message = new MimeMessage(session);
				message.setFrom(new InternetAddress(SENDER));
				message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(recipient));
				message.setSubject(header);
				message.setText(body);
				Transport.send(message);
				System.out.println("Mail sent succesfully!");
	     } catch(MessagingException e){
	    	 System.out.println("Something's fucked up, sorry");
	    	 throw new RuntimeException(e);
	     }	
	}
	
	
}