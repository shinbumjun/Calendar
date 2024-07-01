package com.newdeal.ledger.sample.service;

import org.springframework.stereotype.Service;

import com.newdeal.ledger.sample.mapper.SampleMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
	private final SampleMapper sampleMapper;

}
