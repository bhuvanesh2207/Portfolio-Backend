package com.bhuvaneshkr.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bhuvaneshkr.portfolio.DTO.MailDataDTO;
import com.bhuvaneshkr.portfolio.service.EmailService;

@CrossOrigin("*")
@RestController
public class EmailController {

	@Autowired
	EmailService service;

	@PostMapping("/contact")
	public void sendMail(@RequestBody MailDataDTO dto) {
		service.sendMail(dto);
	}

}
