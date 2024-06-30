package com.newdeal.ledger.sample.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sample {
	private Long sampleId;
	private String contents;

	public static Sample init(String contents) {
		return new Sample(null, contents);
	}

}
