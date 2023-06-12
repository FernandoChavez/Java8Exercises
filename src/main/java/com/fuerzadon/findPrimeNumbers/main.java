package com.fuerzadon.findPrimeNumbers;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 1, 2, 8, 4, 45, 12, 7, 7, 10, 555, 43);
		List<Integer> list2 = Arrays.asList(5,7,1,7,3,567,23,5,0,123,3, 101);
		List<Integer> list3 = Arrays.asList(43, 101, 5, 4, 10, 66);
		
		
		System.out.println("Prime list is: "+methods.findPrimeNumbers(list));
		System.out.println("Prime list2 is: "+methods.findPrimeNumbers(list2));
		
		System.out.println("Prime list is: "+methods.findPrimeNumbersStream(list));
		System.out.println("Prime list2 is: "+methods.findPrimeNumbersStream(list2));

	}

}
