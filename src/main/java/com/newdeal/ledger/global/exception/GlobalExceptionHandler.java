package com.newdeal.ledger.global.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(NewDealException.class)
	public ResponseEntity<ErrorResponse> handleException(NewDealException exception) {
		final ErrorCode errorCode = exception.getErrorCode();
		return ResponseEntity.status(errorCode.getHttpStatus()).body(ErrorResponse.from(errorCode));
	}
}
