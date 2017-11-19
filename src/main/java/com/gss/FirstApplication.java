package com.gss;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApplication {
    public static final String BEANS_XML = "Beans.xml";


    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);
//        ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\resources\\"+BEANS_XML);
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage("I'm new Obgegs");
        obj.printMessage();
        HelloUSA usa = (HelloUSA) context.getBean("helloUSA");
        usa.printMessage();
    }
}