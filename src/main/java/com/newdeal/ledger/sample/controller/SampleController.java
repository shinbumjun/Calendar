package com.newdeal.ledger.sample.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.newdeal.ledger.sample.controller.requset.SampleRequest;
import com.newdeal.ledger.sample.controller.response.SampleResponse;
import com.newdeal.ledger.sample.dto.SampleDto;
import com.newdeal.ledger.sample.service.SampleService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/sample")
@RequiredArgsConstructor
public class SampleController {
	private final SampleService sampleService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createSample(@Valid @RequestBody SampleRequest.Create request) {
		SampleDto sampleDto = SampleDto.fromCreateRequest(request);
		sampleService.createSample(sampleDto);
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<SampleResponse.Get> getAllSample() {
		List<SampleDto> results = sampleService.getAllSample();

		return results.stream().map(dto -> dto.toGetResponse()).toList();
	}

	@GetMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public SampleResponse.Get getSample(
		@PathVariable(name = "id") Long sampleId
	) {
		SampleDto results = sampleService.getSample(sampleId);

		return results.toGetResponse();
	}
}
