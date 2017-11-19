package com.gss;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FirstApplication {
    public static final String BEANS_XML = "Beans.xml";


    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);
//        ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\resources\\"+BEANS_XML);
        HelloWorld obj = (HelloWorld) context.getBean("HelloWorld");

        obj.setMessage("I'm new Obgegs");
        obj.printMessage();
        context.registerShutdownHook();

    }
}
