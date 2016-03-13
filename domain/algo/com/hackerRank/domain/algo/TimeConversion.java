package com.hackerRank.domain.algo;

import java.util.Scanner;

public class TimeConversion {
	
	public static void main(String[] args) {
		int hour,min, sec, mode;
		Scanner sc = new Scanner(System.in);
		String timeIn12HrFString;
		String timeIn12HrF[];
		
		timeIn12HrFString = sc.nextLine();
		timeIn12HrF = timeIn12HrFString.split(":");
		hour = Integer.parseInt(timeIn12HrF[0]);
		min = Integer.parseInt(timeIn12HrF[1]);
		sec = Integer.parseInt(timeIn12HrF[2].substring(0, 2));
		mode = "AM".equals(timeIn12HrF[2].substring(2))?0:1;
		
		System.out.println(getRailwayHourTimeFormat(hour,min,sec,mode));
		sc.close();
	}

	private static String getRailwayHourTimeFormat(int hour, int min, int sec, int mode) {
		StringBuilder time24HrF ;
		int hourIn24 = 0;
		time24HrF = new StringBuilder();
		
		switch(mode)
		{
		case 0:
			if(hour==12)
				hourIn24 = 0;
			else
				hourIn24 = hour;
			break;
		case 1:
			hourIn24 = (hour)%12;
			hourIn24 += 12;
			break;
		}
		
		time24HrF.append(String.format("%02.0f", (float)hourIn24));
		time24HrF.append(":");
		time24HrF.append(String.format("%02.0f", (float)min));
		time24HrF.append(":");
		time24HrF.append(String.format("%02.0f", (float)sec));
		
		return time24HrF.toString();
	}

}
