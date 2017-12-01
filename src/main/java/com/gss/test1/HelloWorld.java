package com.gss.test1;

public class HelloWorld {
    private String message;
    private String message2;

    public HelloWorld() {
    }

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void printMessage() {
        System.out.println("Your message: " + message);
        System.out.println("Your message: " + message2);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going init ");
    }

    public void destroy() throws Exception {
        System.out.println("Bean is going destroy ");
    }
}