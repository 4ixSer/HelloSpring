package com.gss.test3;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>{


    public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("CStartEventHandler Recived");
    }
}
