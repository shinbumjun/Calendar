package com.newdeal.ledger.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.newdeal.ledger.sample.service.SampleService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SampleController {

	private final SampleService sampleService;

	/**
	 * 로그아웃
	 * 
	 * @return doLogout 신범준
	 */
	@GetMapping("/doLogout")
	public String doLogout() {
		return "doLogout"; // 수정
	}

	/**
	 * 문의 게시판 페이지
	 * 
	 * @return index 신범준
	 */
	@GetMapping("/index")
	public String index() {

		int sample = sampleService.list();
		System.out.println("DB설정 확인 : " + sample);

		return "index"; // 수정
	}

	/**
	 * 로그인 페이지
	 * 
	 * @return login 신범준
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/memInfo")
	public String memInfo() {
		return "memInfo";
	}

	@GetMapping("/mInsert")
	public String mInsert() {
		return "mInsert"; // 찰규
	}
}
