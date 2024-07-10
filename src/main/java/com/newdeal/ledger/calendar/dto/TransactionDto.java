package com.newdeal.ledger.acct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDto { // 거래
    private int id;
    private int accountId;
    private String recordType;
    private Date date;
    private Time time;
    private String category;
    private String description;
    private BigDecimal amount;
    private String paymentType;
    private Boolean installment;
    private String keywords;
    private String memo;
    private String imageUrl;
    private String categoryTag;
    private String email;
}

