package com.newdeal.ledger.sample.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.newdeal.ledger.sample.dto.Sample;

@Mapper
public interface SampleMapper {

	int list(); //
}
