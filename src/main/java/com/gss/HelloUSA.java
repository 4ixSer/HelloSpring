package com.gss;

public class HelloUSA {
    private String message;
    private String message2;
    private String message3;

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

    public String getMessage3() {
        return message3;
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

    public void printMessage() {
        System.out.println("Your message: " + message);
        System.out.println("Your message: " + message2);
        System.out.println("Your message: " + message3);
    }
}
