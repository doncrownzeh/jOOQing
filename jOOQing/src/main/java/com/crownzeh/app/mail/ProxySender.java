package com.crownzeh.app.mail;

public class ProxySender implements MailSender {
	
	private RealSender realSender;	
	public ProxySender(){
	}

	@Override
	public void sendMail(String recipient, String header, String body) {
		if(realSender == null){
	         realSender = new RealSender();
	      }
	      realSender.sendMail(recipient, header, body);

	} 
		
		
	

}
