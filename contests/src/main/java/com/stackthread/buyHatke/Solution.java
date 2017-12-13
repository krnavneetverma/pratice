package com.stackthread.buyHatke;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String conStr1[] = sc.nextLine().split(" ");
		String lane[] = sc.nextLine().split(" ");
		
		Integer nTestCases = Integer.valueOf(conStr1[1]);
		
		String nthTestCases[];
		Integer []output = new Integer[nTestCases];
		
		int entry,exit;
		for (int i = 0; i < nTestCases; i++) {
			nthTestCases = sc.nextLine().split(" ");
			entry = Integer.valueOf(nthTestCases[0]);
			exit  = Integer.valueOf(nthTestCases[1]);
			output[i] = findMaxVwhicle(entry,exit,lane);
		}
		sc.close();
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

	private static Integer findMaxVwhicle(int entry, int exit, String[] lane) {
		int vehType = 3;
		int laneWidth;
		for (; entry <= exit; entry++) {
			laneWidth = Integer.valueOf(lane[entry]); 
			if(laneWidth<vehType)
				vehType = laneWidth;
			if(vehType ==1 )
				break;
		}
		return vehType;

	}
}
