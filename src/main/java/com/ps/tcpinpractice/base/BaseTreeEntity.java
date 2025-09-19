package com.ps.tcpinpractice.base;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class BaseTreeEntity<T extends BaseTreeEntity<T>> {
	private UUID errorCodeID;
	private Integer level;
	private Integer sequence;
	private T parent;
	private Set<T> leafNodes = new HashSet<>();

	// 멀티 테넌트 환경, 국제화, 독립적인 관리
	protected BaseTreeEntity(UUID errorCodeID, T parent, Integer sequence) {

	}
}
