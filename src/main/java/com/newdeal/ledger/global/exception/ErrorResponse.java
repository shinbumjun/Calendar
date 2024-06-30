package com.newdeal.ledger.global.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorResponse {
	private HttpStatus httpStatus;
	private String errorName;
	private String errorMessage;

	public static ErrorResponse from(ErrorCode errorCode) {
		return new ErrorResponse(errorCode.getHttpStatus(), errorCode.name(), errorCode.getMessage());
	}

}
