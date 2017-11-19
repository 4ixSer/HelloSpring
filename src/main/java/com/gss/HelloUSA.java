package com.gss;

public class HelloUSA {
    private String message1;
    private String message2;
    private String message3;

    public String getMessag1e1() {
        return message1;
    }

    public void setMessage1(String message) {
        this.message1 = message;
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
        System.out.println("Your message: " + message1);
        System.out.println("Your message: " + message2);
        System.out.println("Your message: " + message3);
    }
}
