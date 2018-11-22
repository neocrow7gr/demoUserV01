package com.example.demoUser.api;

import java.util.Date;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

public class UserRequest {

	private Long id;
	
	@NotNull(message="El nombre es requerido")
	@Size(min=2, max=30, message="El nombre debe tener entre {min} y {max} caracteres")
	private String name;
	private Date birthdate;
	
	
	public UserRequest() {
	
	}


	public UserRequest(Long id,
			@NotNull(message = "El nombre es requerido") @Size(min = 2, max = 30, message = "El nombre debe tener entre {min} y {max} caracteres") String name,
			Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}
