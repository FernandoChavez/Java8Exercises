package com.fuerzadon.splitString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class methods {
	
	public static List<String> splitStringStartWithLetter(String phrase, String letter){
		List<String> myList = new ArrayList<>();
		
		for(String s : phrase.split(",")) {
			myList.add(s);
		}
		
		return myList.stream()
			.filter(i -> i.startsWith(letter))
			.collect(Collectors.toList());
		
		
	}
}
