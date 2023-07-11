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
		Duration duration, firstDuration, lastDuration;
		LocalDateTime startDT, endDT, startWeek = LocalDateTime.of(2023, 7, 3, 0, 0, 0), endWeek = LocalDateTime.of(2023, 7, 10, 0, 0, 0);
		LocalDate startDate, endDate;
		LocalTime startTime, endTime;
		
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
					
					
					//Adding LocalDateTimes in their respective dayList
					dayLists.get(y).add(startDT);
					dayLists.get(y).add(endDT);
					break;
					
				}
			}					
		}
		
		//Adding every dayList in a finalList
		for(List<LocalDateTime> list : dayLists) {
			finalList.addAll(list);
		}
		
		//Sorting finalList elements
		Collections.sort(finalList); 
		
		//Getting rest minutes since Mon 00:00 to start of first meeting
		firstDuration = Duration.between(startWeek, finalList.get(0));
		maxMinutes = (int) firstDuration.toMinutes();
		
		//Getting among rest minutes among meetings and getting longer time rest
		for(int x = 1; x<finalList.size()-1;x=x+2) {	
			duration = Duration.between(finalList.get(x), finalList.get(x+1));
			System.out.println(duration.toMinutes());
			if((int) duration.toMinutes()>maxMinutes) {
				maxMinutes = (int) duration.toMinutes();
			}
		}
		
		//Getting rest minutes since the end of the last meeting until sunday at 24:00/second monday at 00:00 and see if is the longer rest
		lastDuration = Duration.between(finalList.get(finalList.size()-1), endWeek);
		if((int) lastDuration.toMinutes() > maxMinutes) {
			maxMinutes = (int) lastDuration.toMinutes();
		}
		
		return maxMinutes;
	}
}
