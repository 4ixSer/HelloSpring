package com.gss.test1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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