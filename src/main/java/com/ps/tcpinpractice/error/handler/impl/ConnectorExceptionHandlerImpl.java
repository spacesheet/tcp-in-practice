package com.ps.tcpinpractice.error.handler.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;

import com.ps.tcpinpractice.error.handler.ConnectorExceptionHandler;
import com.ps.tcpinpractice.util.CustomUUID;

public class ConnectorExceptionHandlerImpl implements ConnectorExceptionHandler {

	@Override
	public ResponseEntity<Integer> handleConnectorHacked(Exception ex, WebRequest request){
		System.out.println("logging system not yet");
		return ResponseEntity.accepted().(get777(CustomUUID.createUUID())).body(ex.getMessage());
	}
}
