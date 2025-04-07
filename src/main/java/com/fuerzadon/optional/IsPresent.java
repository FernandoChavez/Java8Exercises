package com.fuerzadon.optional;

import java.util.Optional;

public class IsPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user= new User("Fernando");
		User user2=null;
		
		Optional<User> optUser = Optional.ofNullable(user);
		
		//A continuación vas a crear un Optional para un objeto User y vas a determinar si está presente.
		if(optUser.isPresent()) {
			System.out.println(optUser.get().getName());
		}
		
		//or using j8 lambdas)
		//optUser.ifPresent(u -> System.out.println(u.getName()));

	}

}
