package com.gss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApplication {
    public static final String BEANS_XML = "Beans.xml";


    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext ctx =
               new AnnotationConfigApplicationContext();
        ctx.register(HelloWorld.class);
        HelloWorld  helloWorld = ctx.getBean(HelloWorld.class);
        helloWorld.printMessage();
    }
}