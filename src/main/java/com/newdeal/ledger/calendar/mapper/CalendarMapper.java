package com.newdeal.ledger.acct.mapper;

import com.newdeal.ledger.acct.dto.TransactionDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CalendarMapper {

    List<TransactionDto> findAll(HashMap<Object, String> map);
}
