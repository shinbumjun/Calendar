package com.newdeal.ledger.sample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CalendarController { // 계좌

    @GetMapping("/calendar")
    public String doLogout() {
        return "calendar";
    }
}
