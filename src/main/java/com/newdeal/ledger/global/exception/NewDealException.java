package com.newdeal.ledger.global.exception;

import lombok.Getter;

@Getter
public class NewDealException extends RuntimeException {
	private final ErrorCode errorCode;

	public NewDealException(ErrorCode errorCode) {
		super(errorCode.getMessage());
		this.errorCode = errorCode;
	}

}
