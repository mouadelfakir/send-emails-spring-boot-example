package com.stackextend.sendemailsspringbootexample.mail;

public class HTMLMail extends AbstractMail {

    public HTMLMail(String to) {
        super(to);
    }

    @Override
    public String getSubject() {
        return "HTML Email Subject";
    }

    @Override
    public String getContent() {
        return "<html>" +
                    "<body>" +
                        "<p>Hello client,</p>" +
                        "<p>This an <strong>HTML</strong> email content !</p>" +
                    "</body>" +
                "</html>";
    }
}
