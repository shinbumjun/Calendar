package com.newdeal.ledger.sample.controller;

import org.springframework.stereotype.Controller;

import com.newdeal.ledger.sample.service.SampleService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SampleController {
	private final SampleService sampleService;

}
