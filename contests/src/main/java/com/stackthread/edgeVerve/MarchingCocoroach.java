package com.stackthread.edgeVerve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MarchingCocoroach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int poleLen = sc.nextInt();
		int totalRoaches = sc.nextInt();
		List<Integer> roachPositionList = new ArrayList<Integer>();
		for (int i = 0; i < totalRoaches; i++) {
			roachPositionList.add(sc.nextInt());
		}
		sc.close();

		System.out.print(findEarliestTime(poleLen, totalRoaches , roachPositionList)+" ");
		System.out.print(findLatestTime(poleLen, totalRoaches, roachPositionList));
	}

	private static Integer findEarliestTime(int poleLen, int totalRoaches, List<Integer> roachPositionList) {
		Integer minTime = Integer.MIN_VALUE;
		int currPos = 0, tmpPos = 0;
		int tmpMin = 0;
		for (int i = 0; i < totalRoaches; i++) {
			currPos = roachPositionList.get(i);
			tmpPos = poleLen - currPos;
			tmpMin = Math.min(tmpPos, currPos);
			if(tmpMin>minTime)
				minTime = tmpMin;
		}
		return minTime;
	}
	
	private static Integer findLatestTime(int poleLen, int totalRoaches, List<Integer> roachPositionList) {
		Integer maxTime = Integer.MIN_VALUE;
		int currPos = 0, tmpPos = 0;
		int tmpMax = 0;
		for (int i = 0; i < totalRoaches; i++) {
			currPos = roachPositionList.get(i);
			tmpPos = poleLen - currPos;
			tmpMax = Math.max(tmpPos, currPos);
			if (tmpMax > maxTime)
				maxTime = tmpMax;
		}

		return maxTime;
	}



}
