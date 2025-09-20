package com.ps.tcpinpractice.error.errorcode;

import java.util.AbstractMap;
import java.util.Set;

public class BaseErrorCode extends AbstractMap<ErrorKey, ErrorBody> {


	@Override
	public Set<Entry<ErrorKey, ErrorBody>> entrySet() {
		return Set.of();
	}
}
