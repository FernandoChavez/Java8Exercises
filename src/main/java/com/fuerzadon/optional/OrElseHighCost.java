package com.fuerzadon.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OrElseHighCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=null;
		
		Optional<User> optUser = Optional.ofNullable(user);
		
		//en los casos en que la ejecución de la función sea costosa este método es recomendable.
		
		System.out.println(optUser.orElseGet(new Supplier<User>() {
			@Override
			public User get() {
				return User.EMPTY_USER;
			}
			
		}).getName());
		
		//better with j8 lambdas !
		//System.out.println(optUser.orElseGet(() -> User.EMPTY_USER).getName());

	}

}
