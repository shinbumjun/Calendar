package com.newdeal.ledger.sample.dto;

import com.newdeal.ledger.sample.controller.requset.SampleRequest;
import com.newdeal.ledger.sample.controller.response.SampleResponse;
import com.newdeal.ledger.sample.vo.Sample;

import lombok.Data;

@Data
public class SampleDto {
	public String contents;

	public SampleDto(String contents) {
		this.contents = contents;
	}

	public static SampleDto fromCreateRequest(SampleRequest.Create request) {
		return new SampleDto(request.getContent());
	}

	public static SampleDto fromVo(Sample vo) {
		return new SampleDto(vo.getContents());
	}

	public SampleResponse.Get toGetResponse() {
		return new SampleResponse.Get(contents);
	}
}
