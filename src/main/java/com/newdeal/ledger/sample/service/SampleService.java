package com.newdeal.ledger.sample.service;

import static com.newdeal.ledger.global.exception.ErrorCode.*;

import java.util.List;

import org.springframework.stereotype.Service;

import com.newdeal.ledger.global.exception.ErrorCode;
import com.newdeal.ledger.global.exception.NewDealException;
import com.newdeal.ledger.sample.controller.response.SampleResponse;
import com.newdeal.ledger.sample.dto.SampleDto;
import com.newdeal.ledger.sample.mapper.SampleMapper;
import com.newdeal.ledger.sample.vo.Sample;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SampleService {
	private final SampleMapper sampleMapper;

	public void createSample(SampleDto sampleDto) {
		Sample init = Sample.init(sampleDto.contents);
		sampleMapper.save(init);
	}

	public List<SampleDto> getAllSample() {
		List<Sample> result = sampleMapper.findAll();

		return result.stream().map(vo -> SampleDto.fromVo(vo)).toList();
	}

	public SampleDto getSample(Long id) {
		Sample result = sampleMapper.find(id)
			.orElseThrow(() -> new NewDealException(NOT_FOUND_SAMPLE));

		return SampleDto.fromVo(result);
	}
}
