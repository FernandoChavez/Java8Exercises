package com.fuerzadon.meetingBusinessman;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String meetings = 
				  "Sun 10:00-20:00\n"
				+ "Fri 05:00-10:00\n"
				+ "Fri 16:30-23:50\n"
				+ "Sat 10:00-24:00\n"
				+ "Sun 01:00-04:00\n"
				+ "Sat 02:00-06:00\n"
				+ "Tue 03:30-18:15\n"
				+ "Tue 19:00-20:00\n"
				+ "Wed 04:25-15:14\n"
				+ "Wed 15:14-22:40\n"
				+ "Thu 00:00-23:59\n"
				+ "Mon 05:00-13:00\n"
				+ "Mon 15:00-21:00";
		
		String meetings2 = 
				  "Mon 01:00-23:00\n"
				+ "Tue 01:00-23:00\n"
				+ "Wed 01:00-23:00\n"
				+ "Thu 01:00-23:00\n"
				+ "Fri 01:00-23:00\n"
				+ "Sat 01:00-23:00\n"
				+ "Sun 01:00-21:00";
		
		System.out.println("Mayor lapso para descansar son: " + methods.solution(meetings) + " minutos");
		
		System.out.println("Mayor lapso para descansar son: " + methods.solution(meetings2) + " minutos");
	}

}
