package com.demo.eventhandling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class CloseEventHandler implements ApplicationListener<ContextClosedEvent> {

	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("ContextClosedEvent Received");
	}

}
