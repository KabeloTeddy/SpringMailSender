package com.kabeloteddymorrisEmailSender.SpringEmailSender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSendingService {
    @Autowired
    private JavaMailSender mailsender;

    private final String mailReciever=""; //so here is where you would add the email address you want the mail to be sent to
    public void sendMailsender(String emailTo,String subject,String body) {

        SimpleMailMessage message= new SimpleMailMessage();
        message.setFrom(mailReciever);
        message.setTo(emailTo);
        message.setText(body);
        message.setSubject(subject);

        mailsender.send(message);

        //Just for confirmation
        System.out.println("The email has been set!!!");

    }
}
