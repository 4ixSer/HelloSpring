package com.gss;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstApplication {
    public static final String BEANS_XML = "Beans.xml";


    public static void main(String[] args) throws InterruptedException {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(BEANS_XML);
        TextEditor textEditor= (TextEditor) context.getBean("textEditor");
        System.out.println(textEditor);
    }
}