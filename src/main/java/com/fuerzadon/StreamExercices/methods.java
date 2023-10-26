package com.fuerzadon.StreamExercices;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class methods {
	
	
	public static int getAmountEmpty(List<String> list){
		
		return
			(int) list.stream().
			filter(i -> i.isEmpty())
			.count();
	}
	
	public static int getAmountEmptyInStream(Stream<String> stream) {
		
		return 
			(int) stream
			.filter(i -> i.isEmpty())
			.count();
	}
	
	
	public static int getAmountStringGreaterThan3Letter(List<String> list) {
		return
			(int) list.stream()
			.filter(i -> i.length()>3)
			.count();
			
	}
	
	public static int getNumberOfStringStartedASpecifictLetter(List<String> list, String letter) {
		
		return (int) list
				.stream()
				.filter(i -> i.startsWith(letter))
				.count();
	}
	
	public static List<String> removeAllEmptyStrings(List<String> list) {
		
		return
			list.stream()
				.filter(i -> !i.isEmpty())
				.collect(Collectors.toList());
	}
	
	public static List<String> getListStringWith2OrMoreChar(List<String> list){
		
		return list.stream()
				.filter(i -> i.length()>2)
				.collect(Collectors.toList());
	}
	
	public static String addUppercaseandJoinComa(List<String> list){
		return list.stream()
				.map(i -> i.toUpperCase())
				.collect(Collectors.joining(",","¡", "!"));
	}
	
	
	//DISTINCT
	public static List<Integer> getListQuareDistinctNumbers(List<Integer> list){
		return list.stream()
				.distinct()
				.map(i -> i*i)
				.collect(Collectors.toList());
	}
	
	//NO DISTINCT. BETTER SET
	public static Set<Integer> getSetQuareDistinctNumbers(List<Integer> list){
		Set<Integer> mySet = new HashSet<Integer>();
		
		return list.stream()
				.map(i -> i*i)
				.collect(Collectors.toSet());
				
	}
	
	public static Set<Integer> getSetDistinctNumbers(List<Integer> list){
		return list.stream()
				.collect(Collectors.toSet());
				
	}
	
	public static Set<Integer> getTreeSetDistinctNumbers(List<Integer> list){
		
		Set<Integer> ts = new TreeSet<>();
		ts = list.stream()
				.collect(Collectors.toSet());
		return ts;
				
	}
}
