package com.fuerzadon.optional;

import java.util.Optional;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user= new User("John");
		Optional<User> optUser = Optional.ofNullable(user);
		
		//Optional.filter te permite filtrar elementos que no deseas. 
		//Suponiendo que solo deseas imprimir algún resultado para un determinado User, en este ejemplo el User cuyo nombre es “john”.
		
		//filter + ifPresent
		optUser.filter(u -> "John".equals(u.getName()))
			.ifPresent(u -> System.out.println(u.getName()));
		
		//filter + isPresent
		
		if(optUser.filter(u -> "John".equals(u.getName()))
				.isPresent()) {
			System.out.println("John is present");
		}
		
	}

}
