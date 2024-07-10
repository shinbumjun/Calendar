package com.newdeal.ledger.acct.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class acctController { // 계좌

    @GetMapping("/add_acct")
    public String doLogout() {
        return "add_acct";
    }

}
