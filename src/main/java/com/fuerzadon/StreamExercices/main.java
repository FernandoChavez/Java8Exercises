package com.fuerzadon.StreamExercices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myList = Arrays.asList("", "Hola", "Saludo", "", "Despedida", "Tu", "Sal", "El", "Tomate", "Sal" ,"Yo");
		List<Integer> myNumberList = Arrays.asList(1, 6, 4, 7, 1, 9, 23, 6, 1, 1, 2, 8, 8);
		Stream<String> myStream = myList.stream();
		
		
		//Counting Empty String
		System.out.println(methods.getAmountEmpty(myList));
		//System.out.println(methods.getAmountEmptyInStream(myStream));
		
		
		//Count String whose length is more than three
		System.out.println(methods.getAmountStringGreaterThan3Letter(myList));
		
		
		//Count number of String which starts with "a"
		System.out.println(methods.getNumberOfStringStartedASpecifictLetter(myList, "S"));
		
		//Remove all empty Strings from List
		System.out.println(methods.removeAllEmptyStrings(myList));
		
		//Create a List with String more than 2 characters
		System.out.println(methods.getListStringWith2OrMoreChar(myList));
		
		//Convert String to uppercase and Join them with coma
		System.out.println(methods.addUppercaseandJoinComa(myList));
		
		//Create a List of the square of all distinct numbers
		System.out.println(methods.getListQuareDistinctNumbers(myNumberList));
		
		//Create a Set of the square of all distinct numbers without distinct()
		System.out.println(methods.getSetQuareDistinctNumbers(myNumberList));
	}

}
