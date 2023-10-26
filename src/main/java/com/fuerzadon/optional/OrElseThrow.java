package com.fuerzadon.optional;

import java.util.Optional;

public class OrElseThrow {

	public static void main(String[] args) {
		//Vimos que usando orElse / orElseGet lo que buscas es devolver otro valor por default si el valor dentro de Optional está ausente. 
	    //Usando orElseThrow lo que deseas en cambio es tirar una Exception si este valor no está
		//orElseThrow
		
		User user=null;
		
		Optional<User> optUser = Optional.ofNullable(user);
		optUser.orElseThrow(IllegalArgumentException::new);
	}

}
