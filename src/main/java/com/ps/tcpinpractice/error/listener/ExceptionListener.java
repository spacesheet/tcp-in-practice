package com.ps.tcpinpractice.error.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import jakarta.servlet.annotation.WebListener;

@WebListener
public class ExceptionListener implements ApplicationListener<ApplicationReadyEvent> {

	private static String CONNECTOR_HACKED_CODE = "777";

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {

	}

	@Override
	public boolean supportsAsyncExecution() {
		return ApplicationListener.super.supportsAsyncExecution();
	}
}
