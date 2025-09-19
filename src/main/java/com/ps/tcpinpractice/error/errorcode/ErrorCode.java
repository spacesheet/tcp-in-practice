package com.ps.tcpinpractice.error.errorcode;

import java.util.UUID;

public class ErrorCode extends BaseErrorCode {
	private UUID uuidErrorCode;

	protected ErrorCode(String name, BaseErrorCode parent, Integer sequence) {
		super(name, parent, sequence);
	}

	// 전역에서 사용하지 않기 때문에 FI로 만들지 않음
	public static BaseErrorCode createErrorCode(UUID uuidErrorCode) {
		return ;
	};
}
