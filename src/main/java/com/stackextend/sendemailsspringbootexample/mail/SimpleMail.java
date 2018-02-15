package com.stackextend.sendemailsspringbootexample.mail;

public class SimpleMail extends AbstractMail {

    public SimpleMail(String to) {
        super(to);
    }

    @Override
    public String getSubject() {
        return "Simple Email Subject";
    }

    @Override
    public String getContent() {
        return "Hello client,\n This a simple email content !";
    }
}
