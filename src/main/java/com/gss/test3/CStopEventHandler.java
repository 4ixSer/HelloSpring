package com.gss.test3;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("CStopEventHandler received   ");
    }
}
