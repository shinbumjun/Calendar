package com.newdeal.ledger.acct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountsDto { // 계좌
    private int accountId;
    private String email;
    private String accountNumber;
    private BigDecimal balance;
    private Date openedDate;
}
