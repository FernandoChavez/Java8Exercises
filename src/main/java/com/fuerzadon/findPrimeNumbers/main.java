package com.fuerzadon.findPrimeNumbers;

import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 1, 2, 8, 4, 45, 12, 7, 7, 10, 555);
		
		System.out.println("Prime list is: "+methods.findPrimeNumbers(list));

	}

}
