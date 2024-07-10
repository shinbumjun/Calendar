package com.newdeal.ledger.acct.dto;

import lombok.Data;

@Data
public class IncomeDTO {
    private Long id; // 각 수입 기록의 고유 ID
    private String date; // 수입 발생 날짜 (Date 형식으로 처리)
    private String time; // 수입 발생 시간 (Time 형식으로 처리)
    private String category; // 수입 주요 분류
    private String description; // 수입 내역
    private Double amount; // 수입 금액
    private String paymentType; // 수입 방식
    private String keywords; // 키워드
    private String memo; // 메모
    private String imageUrl; // 관련 이미지의 URL
    private String categoryTag; // 카테고리 태그
}