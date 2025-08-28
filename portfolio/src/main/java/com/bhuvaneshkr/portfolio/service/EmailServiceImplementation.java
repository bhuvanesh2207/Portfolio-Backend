
package com.bhuvaneshkr.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.bhuvaneshkr.portfolio.DTO.MailDataDTO;

@Service
public class EmailServiceImplementation implements EmailService{

	@Autowired
	JavaMailSender sender; 
	
	@Override
	public void sendMail(MailDataDTO dto) {
        SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("bhuvaneshb546@gmail.com");
		message.setSubject("New Contact Form Submission - Portfolio Website");
		message.setText(dto.getMessage());
		
		sender.send(message);
		System.out.println("Mail Send successfully");
	}
}