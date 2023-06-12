package com.fuerzadon.findPrimeNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class methods {
	
	////////USING STREAMS
	
	public static List<Integer> findPrimeNumbersStream(List<Integer> numberList){
		return numberList.stream()
			.filter(i -> isPrimeStream(i))
			.collect(Collectors.toList());
	}
	
	
	private static boolean isPrimeStream(int number) {
		if (number<=1) {
			return false;
		}
		
		int limitRange = number/2;
		//List<Integer> range = IntStream.range(1, limitRange+1).boxed().collect(Collectors.toList());
		List<Integer> range2 = IntStream.range(2, limitRange+1).boxed().toList();
		return range2.stream()
			.allMatch(n -> number%n != 0);
	}
	
	
	////// NO STREAMS
	
	public static List<Integer> findPrimeNumbers(List<Integer> numberList){
		List<Integer> myList = new ArrayList<>();
		
		for(int x : numberList) {
			if(isPrime(x)){
				myList.add(x);
			}
		}
	
		return myList;
	}
	
	private static boolean isPrime(int number) {
		if(number <=1) {
			return false;
		}
		
		for(int x = 2; x*x<=number; x++) {
			if(number%x ==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
}
