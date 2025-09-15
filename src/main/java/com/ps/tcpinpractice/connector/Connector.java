package com.ps.tcpinpractice.connector;

// 연결
// 3-way-handshake
// syn, ack

// polling vs 비동기I/O
// syn,ack vs 입출력 async

// import com.ps.tcpinpractice.domain.ConnectorManager;

abstract class Connector {
	protected int ConnectorID;
	protected ConnectorManager connectorManager;


	// abstract void addListener(Connection.Listener );

	// 커넥터
	// 	- 패킷
	// 		- 명령 모음
	// 	- 입력
	// 		- 버퍼
	// 	- 출력
	// 커넥터 관리자 - 리스너 더하구, 빼고, 비우고,


}
