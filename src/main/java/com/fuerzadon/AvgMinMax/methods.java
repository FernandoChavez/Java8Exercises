package com.fuerzadon.AvgMinMax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class methods {

	public static List<Double> findAvgMaxMin(List<Integer> list){
		List<Double> myList = new ArrayList<>();
			
//		int min = list.stream()
//			.min(Integer::compare).get();
		
		double max = list.stream()
			.max(Comparator.naturalOrder()).get();
		
		double min = list.stream()
			.min(Comparator.naturalOrder()).get();	
		
		
		double avg = list.stream()
			.collect(Collectors.averagingDouble(num -> num));
		
		myList.add(min);
		myList.add(max);
		myList.add(avg);
		
		return myList;
		
		
	}
}
