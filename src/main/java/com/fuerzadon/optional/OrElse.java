package com.fuerzadon.optional;

import java.util.Optional;

public class OrElse {

	public static void main(String[] args) {
		User user= new User("Fernando");
		User user2=null;
		
		Optional<User> optUser = Optional.ofNullable(user2);
		
		//Lo que hace orElse es devolver el valor si está presente o el valor que se pasa por parámetro si está ausente. Es decir usa un valor DEFAULT si el objeto no esta presente.
		System.out.println(optUser.orElse(User.EMPTY_USER).getName());

		//en los casos en que la ejecución de la función sea costosa este método es recomendable.
	}

}
