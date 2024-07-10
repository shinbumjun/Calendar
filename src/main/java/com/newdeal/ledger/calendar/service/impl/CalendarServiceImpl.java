package com.newdeal.ledger.acct.service.impl;

import com.newdeal.ledger.acct.dto.ExpenseDTO;
import com.newdeal.ledger.acct.dto.IncomeDTO;
// import com.newdeal.ledger.acct.mapper.CalendarMapper;
import com.newdeal.ledger.acct.dto.TransactionDto;
import com.newdeal.ledger.acct.mapper.CalendarMapper;
import com.newdeal.ledger.acct.service.CalendarService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CalendarServiceImpl implements CalendarService {

    private final CalendarMapper calendarMapper;

    @Override
    public List<TransactionDto> findAll(HashMap<Object, String> map) {
        System.out.println("년 : " + map.get("year")); // 2024
        System.out.println("월 : " + map.get("month")); // 7
        return calendarMapper.findAll(map);
    }
}
