package com.bhuvaneshkr.portfolio.service;

import com.bhuvaneshkr.portfolio.DTO.MailDataDTO;

public interface EmailService {

	void sendMail(MailDataDTO dto);

}