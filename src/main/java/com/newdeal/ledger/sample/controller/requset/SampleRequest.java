package com.newdeal.ledger.sample.controller.requset;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

public class SampleRequest {

	@Getter
	public static class Create {
		@NotNull
		private String content;
	}
}
