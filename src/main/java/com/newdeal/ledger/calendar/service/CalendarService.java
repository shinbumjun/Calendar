package com.newdeal.ledger.acct.service;

import com.newdeal.ledger.acct.dto.ExpenseDTO;
import com.newdeal.ledger.acct.dto.IncomeDTO;
import com.newdeal.ledger.acct.dto.TransactionDto;

import java.util.HashMap;
import java.util.List;

public interface CalendarService {

    // 월단위 거래 내역
    List<TransactionDto> findAll(HashMap<Object, String> map);
}
