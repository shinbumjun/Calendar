package com.newdeal.ledger.sample.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.newdeal.ledger.sample.vo.Sample;

@Mapper
public interface SampleMapper {
	void save(Sample sample);

	List<Sample> findAll();

	Optional<Sample> find(Long id);
}
