package com.gss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApplication {
    private String message;

    public FirstApplication() {
    }

    public FirstApplication(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        FirstApplication obj = (FirstApplication) context.getBean("FirstApplication");
        obj.printMessage();
    }

    public void printMessage() {
        System.out.println("Your message: " + message);
    }
}
