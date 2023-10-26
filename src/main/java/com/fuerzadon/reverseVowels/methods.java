package com.fuerzadon.reverseVowels;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class methods {
	public String reverseVowel(String s) {
		String myString = "";
		Stack<Character> vowels = new Stack<Character>();
		Stream<Character> myStream = s.chars().mapToObj(c -> (char)c);

		vowels = myStream
		.filter(i -> isVowel(i))
		.collect(Collectors.toCollection(Stack::new));
		
		for(int x = 0; x<s.length(); x++) {
			if(!isVowel(s.charAt(x))) {
				myString += s.charAt(x);
			}else {
				myString += vowels.pop();
			}
		}
		return myString;
	}
	
	static boolean isVowel(char c) {
		return ("aeiouAEIOU".indexOf(c)!=-1 ? true : false);
	}
}
