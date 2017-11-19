package com.gss;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloworld implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String beanName) throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String beanName) throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return o;
    }
}