package com.ps.tcpinpractice.error.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.ps.tcpinpractice.error.exception.ConnectorHackedException;
import com.ps.tcpinpractice.util.CustomUUID;

@ControllerAdvice
@FunctionalInterface
public interface ConnectorExceptionHandler {
	@ExceptionHandler(value = {ConnectorHackedException.class})
	ResponseEntity<Integer> handleConnectorHacked(Exception ex, WebRequest request);
}
