package com.newdeal.ledger.acct.controller;

import com.newdeal.ledger.acct.dto.ExpenseDTO;
import com.newdeal.ledger.acct.dto.IncomeDTO;
import com.newdeal.ledger.acct.dto.TransactionDto;
import com.newdeal.ledger.acct.service.CalendarService;
import com.newdeal.ledger.sample.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/calendar")
@RequiredArgsConstructor
public class CalendarController { // 달력

    private final CalendarService calendarService;

    @GetMapping
    public String calendar() {
        HashMap<Object, String> map = new HashMap<>();
        // 현재 날짜를 가져옵니다.
        LocalDate currentDate = LocalDate.now();
        // 현재 년도와 월을 가져옵니다.
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        // map에 현재 날짜를 담습니다
        map.put("year", String.valueOf(year));
        map.put("month", String.valueOf(month));

        // 월단위 거래 내역
        List<TransactionDto> calendars = calendarService.findAll(map);
        System.out.println("월단위 거래 내역 : " + calendars);
        
        return "calendar";
    }

    @GetMapping("/calendarget")
    public String calendarget(@RequestParam String day, @RequestParam String monthYear) {

//        // monthYear에서 연도와 월 추출
//        int year = Integer.parseInt(monthYear.substring(0, 4)); // 2024
//        int month = Integer.parseInt(monthYear.substring(6, 7)); // 7
//        // day를 정수로 변환
//        int dayOfMonth = Integer.parseInt(day); // 4
//
//        // LocalDate 객체 생성
//        LocalDate date = LocalDate.of(year, month, dayOfMonth);
//        System.out.println("날짜 : " + date); // 2024-07-10


        return "expenseDetails"; // 프래그먼트를 반환
    }
}
