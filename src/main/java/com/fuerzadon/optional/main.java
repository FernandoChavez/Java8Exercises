package com.fuerzadon.optional;

import java.util.Optional;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user= new User("Fernando");
		User user2=null;
		//Optional<User> optUser = Optional.of(user2);
		
		//Si sabes que el objeto user está null o es posible que esté nulo y quieres devolver un optional, debes utilizar el metodo Optional.ofNullable();
		//Create Optional for Users
		Optional<User> optUser = Optional.ofNullable(user2);
		
	
		
		
	}

}
