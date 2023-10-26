package com.fuerzadon.optional;

public class User {

	public static final User EMPTY_USER = new User("Usuario Nuevo");
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
