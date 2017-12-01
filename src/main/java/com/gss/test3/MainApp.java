package com.gss.test3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  new ClassPathXmlApplicationContext("Bean1.xml");
//        context.start();
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        obj.printMessage();

        CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
        cvp.publish();
        cvp.publish();

//        context.stop();
    }
}


