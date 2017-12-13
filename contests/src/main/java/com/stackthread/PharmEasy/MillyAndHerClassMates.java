package com.stackthread.PharmEasy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MillyAndHerClassMates {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		List<String> rsltList = new ArrayList<String>();
		//number of test cases
		int testCases = Integer.parseInt(line);
		//number of students in line
		int nStudents;
		//values for each test cases
		for (int i = 0; i < testCases; i++) {
			nStudents = Integer.parseInt(sc.nextLine());
			//height of students given in input
			int heights[] = new int[nStudents];
			//reading heights to an int array
			for (int j = 0; j < nStudents; j++) {
				heights[j] = sc.nextInt();
			}
			//moving to next line,as we have used nextInt above
			sc.nextLine();
			//adding results for each test case to the result list
			rsltList.add(getGroupIdxRange(heights));
		}
		sc.close();

		for (Iterator<String> iterator = rsltList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}

	}
/**
 * finds starting and end indices for given line of students..
 * @param heights
 * @return
 */
	private static String getGroupIdxRange(int[] heights) {
		//preVal: height of preceding student, where we found decrement of heights in line
		int si = -1, li = -1, preVal = -1;
		//is heights are in decreasing order
		boolean isDcrmt = false;
		boolean isSorted = true;
		StringBuilder sb = new StringBuilder();
		
		//case 1:
		//check if line is already sorted
		for (int i = 1; i < heights.length; i++) {
			if (heights[i - 1] > heights[i]) {
				isSorted = false;
			}
		}
		// return -1 -1 if line already sorted. 
		if (isSorted) {
			return "-1 -1";
		}
		
		//Case 2: line is not sorted
		for (int i = 1; i < heights.length; i++) {
			//height of preceding student is greater: potential index to reverse group 
			if (heights[i - 1] >= heights[i]) {
				if (!isDcrmt) {
					isDcrmt = true;
					si = i - 1;
					li = i;
					//safe check for array
					if (i - 2 >= 0)
						preVal = heights[i - 2];
					else
						preVal = heights[i - 1];
					
				} else {
					li++;
				}
			}
			//
			if (isDcrmt) {
				//keep it false for next student group range
				isDcrmt = false;
				
				//sorting is not possible by taking students uniquely in a group
				if (preVal > heights[li]) {
					sb = new StringBuilder("-1 -1");
					break;
				}
				
				// new line logic: for each group,output should be printed in a new line.
				if (sb.length() > 0) {
					sb.append("\n");
				}
				
				sb.append(++si + " " + ++li);
				
				//reset indices
				si = -1;
				li = -1;
			}

		}
		return sb.toString();
	}

}
