package com.fuerzadon.meetingBusinessman;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class methods {

	public static int solution(String S) {			
		int day, maxMinutes=0;
		Duration duration;
		LocalDateTime startDT, endDT;
		LocalDate date, startDate, endDate;
		LocalTime startTime, endTime;
		String updatedMeeting;	
		
		List<String> listMeetings = Arrays.asList(S.split("\\R"));
		System.out.println(listMeetings);
		
		List<String> dayNames = Arrays.asList("Mon", "Tue","Wed", "Thu", "Fri", "Sat", "Sun");
		List<Integer> dayNumbers = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
		
		List<LocalDateTime> mon = new ArrayList<>();
		List<LocalDateTime> tus = new ArrayList<>();
		List<LocalDateTime> wed = new ArrayList<>();
		List<LocalDateTime> thu = new ArrayList<>();
		List<LocalDateTime> fri = new ArrayList<>();
		List<LocalDateTime> sat = new ArrayList<>();
		List<LocalDateTime> sun = new ArrayList<>();
		List<List<LocalDateTime>> dayLists = Arrays.asList(mon, tus, wed, thu, fri, sat, sun);
		List<LocalDateTime> finalList = new ArrayList<>();
		
		for(int x = 0; x<listMeetings.size(); x++) {
			for(int y = 0; y<dayNames.size(); y++) {
				if(listMeetings.get(x).substring(0,3).equals(dayNames.get(y))) {
					
					//Start date & time meeting
					startTime = LocalTime.parse(listMeetings.get(x).substring(4,9));
					day = dayNumbers.get(y);
					startDate = LocalDate.of(2023, 7, day);
					startDT = LocalDateTime.of(startDate, startTime);
					
					//End date & time meeting
					if(listMeetings.get(x).substring(10,15).equals("24:00")) {
						day = dayNumbers.get(y)+1;
						endTime= LocalTime.parse(listMeetings.get(x).replace("24:00", "00:00").substring(10,15));
					}else {
						day = dayNumbers.get(y);
						endTime= LocalTime.parse(listMeetings.get(x).substring(10,15));
					}
					endDate=LocalDate.of(2023, 7, day);
					endDT = LocalDateTime.of(endDate, endTime);
					
					
					//adding LocalDateTimes in their respective dayList
					dayLists.get(y).add(startDT);
					dayLists.get(y).add(endDT);
					break;
					
				}
			}					
		}
		/*
		
		for(List<LocalDateTime> list : dayLists) {
			System.out.println(list);
		}
		*/
		
		for(List<LocalDateTime> list : dayLists) {
			finalList.addAll(list);
		}
		
		/*
		System.out.println();
		System.out.println();
		System.out.println(finalList);
		*/
		
		Collections.sort(finalList); 
		
		
		System.out.println();
		System.out.println();
		System.out.println("Ahora ordenado");
		for(LocalDateTime t : finalList) {
			System.out.println(t);
		}
		
		
		for(int x = 1; x<finalList.size()-1;x=x+2) {
			
			duration = Duration.between(finalList.get(x), finalList.get(x+1));
			System.out.println(duration.toMinutes());
			if((int) duration.toMinutes()>maxMinutes) {
				maxMinutes = (int) duration.toMinutes();
			}
		}
		
		return maxMinutes;
	}
}
