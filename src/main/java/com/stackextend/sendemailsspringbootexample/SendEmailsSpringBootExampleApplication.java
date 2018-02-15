package com.stackextend.sendemailsspringbootexample;

import com.stackextend.sendemailsspringbootexample.mail.HTMLMail;
import com.stackextend.sendemailsspringbootexample.mail.SimpleMail;
import com.stackextend.sendemailsspringbootexample.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendEmailsSpringBootExampleApplication implements CommandLineRunner {

    @Autowired
    private MailSenderService senderService;

	@Override
	public void run(String... args) throws Exception {

	    // send a simple mail
        senderService.sendSimpleMail(new SimpleMail("example@gmail.com"));

        //send an HTML mail
        senderService.sendHTMLMail(new HTMLMail("example@gmail.com"));
	}

    public static void main(String[] args) {
        SpringApplication.run(SendEmailsSpringBootExampleApplication.class, args);
    }
}
