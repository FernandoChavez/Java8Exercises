package com.fuerzadon.StreamExercices;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class methods {
	
	//Counting Empty String
	public static int getAmountEmpty(List<String> list){
		
		return
			(int) list.stream()
			.filter(String::isEmpty)
			//.filter(i -> i.isEmpty())
			.count();
	}
	
	
	public static int getAmountEmptyInStream(Stream<String> stream) {
		
		return 
			(int) stream
			.filter(String::isEmpty)
			//.filter(i -> i.isEmpty())
			.count();
	}
	
	//Count String whose length is more than three
	public static int getAmountStringGreaterThan3Letter(List<String> list) {
		return
			(int) list.stream()
			.filter(i -> i.length()>3)
			.count();
			
	}
	
	//Count number of String which starts with an specifict letter
	public static int getNumberOfStringStartedASpecifictLetter(List<String> list, String letter) {
		
		return (int) list
				.stream()
				.filter(i -> i.startsWith(letter))
				.count();
	}
	
	//Remove all empty Strings from List
	public static List<String> removeAllEmptyStrings(List<String> list) {
		
		return
			list.stream()
				.filter(i -> !i.isEmpty())
				.collect(Collectors.toList());
	}
	
	
	//Create a List with String more than 2 characters
	public static List<String> getListStringWith2OrMoreChar(List<String> list){
		
		return list.stream()
				.filter(i -> i.length()>2)
				.collect(Collectors.toList());
	}
	
	//Convert String to uppercase and Join them with coma
	public static String addUppercaseandJoinComa(List<String> list){
		return list.stream()
				.map(i -> i.toUpperCase())
				.collect(Collectors.joining(",","¡", "!"));
	}
	
	
	//DISTINCT
	//Create a List of the square of all distinct numbers
	public static List<Integer> getListQuareDistinctNumbers(List<Integer> list){
		return list.stream()
				.distinct()
				.map(i -> i*i)
				.collect(Collectors.toList());
	}
	
	//Create a sorted list of all distinct numbers, receiving an array
	public static List<Integer> getSortedlistFromArray(int array[]){
		return Arrays.stream(array) 
				.boxed()  //convert ints to integers
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	//NO DISTINCT. BETTER SET
	//Create a Set of the square of all distinct numbers without distinct()
	public static Set<Integer> getSetQuareDistinctNumbers(List<Integer> list){
		Set<Integer> mySet = new HashSet<Integer>();
		
		return list.stream()
				.map(i -> i*i)
				.collect(Collectors.toSet());
				
	}
	
	//Create a Set of all distinct numbers without distinct()
	public static Set<Integer> getSetDistinctNumbers(List<Integer> list){
		return list.stream()
				.collect(Collectors.toSet());
				
	}
	
	//Create a treeSet for getting all distinct numbers in ascending orders
	public static Set<Integer> getTreeSetDistinctNumbers(List<Integer> list){
		
		Set<Integer> ts = new TreeSet<>();
		ts = list.stream()
				.collect(Collectors.toSet());
		return ts;
				
	}
}
