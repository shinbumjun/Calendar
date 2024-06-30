package com.newdeal.ledger.global.exception;

import static org.springframework.http.HttpStatus.*;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
	NOT_FOUND_SAMPLE(NOT_FOUND, "SAMPLE이 존재하지 않습니다.");

	private final HttpStatus httpStatus;
	private final String message;
}
