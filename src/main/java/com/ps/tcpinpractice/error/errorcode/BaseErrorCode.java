package com.ps.tcpinpractice.error.errorcode;

import java.util.UUID;

import com.ps.tcpinpractice.base.BaseTreeEntity;

public class BaseErrorCode extends BaseTreeEntity<BaseErrorCode> {
	private Integer errorCode;
	private String message;

	protected BaseErrorCode(UUID uuidErrorCode, BaseErrorCode parent, Integer sequence) {
		super(uuidErrorCode, parent, sequence);
	}


}
