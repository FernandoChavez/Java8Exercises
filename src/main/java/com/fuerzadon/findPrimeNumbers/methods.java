package com.fuerzadon.findPrimeNumbers;

import java.util.List;
import java.util.stream.Collectors;

public class methods {
	
	public static List<Integer> findPrimeNumbers(List<Integer> numberList){
		
		return numberList.stream()
					.filter(i -> i%2!=0)
					.collect(Collectors.toList());
	}
	
}
