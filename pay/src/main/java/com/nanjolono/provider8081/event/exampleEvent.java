package com.nanjolono.provider8081.event;

import org.springframework.context.ApplicationEvent;

public class exampleEvent extends ApplicationEvent {
    private final String address;
    private final String content;
    public exampleEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }
}
