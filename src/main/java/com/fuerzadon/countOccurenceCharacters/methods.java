package com.fuerzadon.countOccurenceCharacters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class methods {
	
	public static int getAmountOccurrenceCharactersByStream(String word) {	
		//IntStream stream2 = word.chars();	
		//Stream<Character> stream = word.codePoints().mapToObj(c -> (char) c);
		/*
		Stream<Character> stream2 = word.chars().mapToObj(c -> (char) c);
        
		return
			(int) stream2
			//.filter(i -> i=='e')
			.filter(i -> i.equals('e'))
			.count();
			
		*/
		
		Stream<Character> stream = word.chars().mapToObj(c ->(char)c);
		
		return (int)
			stream
			.filter(i -> i=='e')
			.count();
				
	}
	
	
	public static int getAmountOccurrenceCharactersByList(String word) {
		/*
		List<Character> list = new ArrayList<>();
		
		for(char ch : word.toCharArray()) {
			list.add(ch);
		}
		
		return
			(int) list.stream()
			.filter(i -> i=='e')
			.count();
		*/
		
		List<Character> list = new ArrayList<>();	
		
		for(char ch : word.toCharArray()) {
			list.add(ch);
		}
		
		return (int) list.stream()
				.filter(i ->i=='e')
				.count();
		
	
	}
	
}
