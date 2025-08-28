package com.bhuvaneshkr.portfolio.DTO;

import javax.validation.constraints.Email;

public class MailDataDTO {

	@Email
	private String email;
	private String message;

	public MailDataDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MailDataDTO(@Email String email, String message) {
		super();
		this.email = email;
		this.message = message;
	}

	@Override
	public String toString() {
		return "MailDataDTO [email=" + email + ", message=" + message + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
