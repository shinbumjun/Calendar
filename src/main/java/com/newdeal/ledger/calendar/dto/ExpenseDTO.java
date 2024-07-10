package com.newdeal.ledger.acct.dto;

import lombok.Data;

@Data
public class ExpenseDTO {
    private Long id; // 각 지출 기록의 고유 ID
    private String date; // 지출 발생 날짜 (Date 형식으로 처리)
    private String time; // 지출 발생 시간 (Time 형식으로 처리)
    private String category; // 지출 주요 분류
    private String subCategory; // 지출 세부 분류
    private String description; // 지출 내역
    private Double amount; // 지출 금액
    private String paymentType; // 지불 방식
    private Boolean installment; // 할부 여부
    private String keywords; // 키워드
    private String memo; // 메모
    private String imageUrl; // 관련 이미지의 URL
    private String categoryTag; // 카테고리 태그
}
