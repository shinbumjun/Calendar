package com.newdeal.ledger.sample.controller.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class SampleResponse {

	@Getter
	@AllArgsConstructor
	public static class Get {
		private String content;
	}
}
