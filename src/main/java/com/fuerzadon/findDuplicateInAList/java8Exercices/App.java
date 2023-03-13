package com.fuerzadon.findDuplicateInAList.java8Exercices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class App 
{
    public static void main( String[] args ) {
    	Stream<Integer> stream = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
        List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);   
    	List<String> list2 = Arrays.asList("Book", "Toy", "Videogame", "Book", "Earphone", "Phone", "Phone", "Disc",
				"Videogame", "Book");
      
        // Print the found duplicate elements
        //System.out.println(Methods.findDuplicateInStream(stream));	
            
        //System.out.println(Methods.findDuplicateInStreamWithFrequency(list));
    	
    	System.out.println(Methods.findDuplicate(list2));
    }	
}

