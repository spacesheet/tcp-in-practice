package com.ps.tcpinpractice.error.exception;

public class ConnectorHackedException extends RuntimeException {
	public ConnectorHackedException(int errorCode777) {
		super("해당 커넥터는 존재하지 않습니다. : " + errorCode777);
	}
}
