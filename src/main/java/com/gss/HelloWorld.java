package com.gss;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean {
    private String message;

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

    public void printMessage() {
        System.out.println("Your message: " + message);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going init ");
    }

    public void destroy() throws Exception {
        System.out.println("Bean is going destroy ");
    }
}