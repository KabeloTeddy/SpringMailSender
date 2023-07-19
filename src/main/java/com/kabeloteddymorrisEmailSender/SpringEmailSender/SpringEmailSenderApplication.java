package com.kabeloteddymorrisEmailSender.SpringEmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailSenderApplication {
	@Autowired

	private  EmailSendingService sendingService;
	private final String mailReciever="";

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailSenderApplication.class, args);

	}

	//method that will entail the content of the email
	@EventListener(ApplicationReadyEvent.class)
	public  void  sendEmail(){
		sendingService.sendMailsender(mailReciever,"Testing 101","This is to test if the serv" +
				"ice actually works!");
	}
}
