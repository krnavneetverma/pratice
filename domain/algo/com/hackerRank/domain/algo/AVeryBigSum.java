package com.hackerRank.domain.algo;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		String strIntArray[] ;
		
		line = sc.nextLine();
		line = sc.nextLine();
		strIntArray = line.split(" ");
		System.out.println(findSumOfArray(strIntArray));
		sc.close();
	}

	private static Long findSumOfArray(String[] strIntArray) {
		Long longValue, sumOfArray = 0L;
		String strLong;
		for (int i = 0; i < strIntArray.length; i++) {
			strLong = strIntArray[i];
			longValue = Long.parseLong(strLong);
			sumOfArray+=longValue;
		}
		return sumOfArray;
	}
}
