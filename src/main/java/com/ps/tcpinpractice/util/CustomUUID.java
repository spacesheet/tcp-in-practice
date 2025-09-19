package com.ps.tcpinpractice.util;

import java.util.UUID;

public class CustomUUID {
	private static String PrefixUUID() {
		return UUID.randomUUID().toString().substring(0, 7);
	}

	public static UUID createUUID() {
		// uuid
		return UUID.fromString(PrefixUUID());
	}

	// 해시 충돌 방지가 이걸로 될까
	// seed 값을 시간으로 쓰지 않으려고 uuid 반복

}
