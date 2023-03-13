package com.fuerzadon.findDuplicateInAList.java8Exercices;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
	
	public static <T> Set<T> findDuplicateInStream(Stream<T> stream){
		// Set to store the duplicate elements
		Set<T> items = new HashSet<>();
			
		return stream
			// Set.add() returns false if the element was already present in the set. Hence filter such elements
			.filter(n -> !items.add(n))
			// Collect duplicate elements in the set
			.collect(Collectors.toSet());	
	}
	
	
	
	
	
	public static <T> Set<T> findDuplicateInStreamWithFrequency(List<T> list){
		
		return list.stream()
			// Count the frequency of each element and filter the elements with frequency > 1
			.filter(i -> Collections.frequency(list, i) > 1)
			// And Collect them in a Set
			.collect(Collectors.toSet());
	}	
	
	public static Set<String> findDuplicate(List<String> list){
		Set <String> mySet= new HashSet();
	
//		return list.stream()
//				.filter(i -> Collections.frequency(list, i)>1)
//				.collect(Collectors.toSet());
		
		mySet = list.stream()
				.filter(i -> Collections.frequency(list, i)>1)
				.collect(Collectors.toSet());
		
		return mySet;
				
	}
}
