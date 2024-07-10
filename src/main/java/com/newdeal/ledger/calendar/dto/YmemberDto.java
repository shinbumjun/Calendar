package com.newdeal.ledger.acct.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class YmemberDto { // 회원
    private String email;
    private String password;
    private String name;
    private String phone;
    private String address;
    private String profileImage;
    private Date createdAt;
}
