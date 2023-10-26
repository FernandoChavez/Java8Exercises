package com.fuerzadon.repeatedValues;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class methods {
	
	/*
	Una solución simple es iterar a través de todos los valores en la lista e insertar cada elemento en un HashSet. 
	Si el elemento actual ya existe en el conjunto, entonces es un duplicado. 
	Puede recopilar todos los duplicados encontrados en una nueva lista.

	Esto se puede hacer fácilmente usando Java 8 Stream. Tenga en cuenta que la solución utiliza el valor de retorno 
	de la Set.add() método para determinar si el valor ya está presente en el conjunto o no
	*/
	
	public static Set<String> findDuplicatesWithSet(List <String> list){
		
		Set<String> seen = new HashSet<>();
		
		return list.stream()
				.filter(e -> !seen.add(e))
				.collect(Collectors.toSet());
		
	}
	
	//La forma más sencilla es probablemente contar la frecuencia de cada elemento de la lista para determinar si es un duplicado o no. 
	//Puedes usar el Collections.frequency() método para esto, que devuelve el número de elementos en la colección.
	
	
	public static Set<String>findDuplicateWithFrequency(List<String> list){
		/*
		
		return list.stream()
				.filter(i -> Collections.frequency(list, i)>1)
				.collect(Collectors.toSet());
		*/
		
		return list.stream()
			.filter(i -> Collections.frequency(list,i )>1)
			.collect(Collectors.toSet());
		
	}
	
	public static int getNumberRepeats(List<String> list, String word) {
		return (int) list.stream()
				.filter(i -> i.contains(word))
				.count();
	}
	public static int getNumberRepeatIncludeALetter(List<String> list, char letter) {
		
		return (int) list.stream()
			.filter(i -> i.indexOf(letter)!=-1)
			.count();
	}
}
