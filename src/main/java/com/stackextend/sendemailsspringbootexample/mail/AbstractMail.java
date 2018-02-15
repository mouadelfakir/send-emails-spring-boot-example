package com.stackextend.sendemailsspringbootexample.mail;

public abstract class AbstractMail {

    private final String to;

    public AbstractMail(String to) {
        this.to = to;
    }

    public String getTo() {
        return this.to;
    }

    public abstract String getSubject();

    public abstract String getContent();
}
