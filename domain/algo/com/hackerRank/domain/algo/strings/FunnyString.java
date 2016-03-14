/******
https://www.hackerrank.com/challenges/funny-string

Suppose you have some string SS having length NN that is indexed from 00 to N−1N−1. 
You also have some string RR that is the reverse of string SS. SS is funny if 
the condition | S[j]−S[j−1] |=| R[j]−R[j−1] || S[j]−S[j−1] |=| R[j]−R[j−1] | is true 
for every jj from 11 to N−1N−1.
Note: For some string SS, S[j]S[j] denotes the ASCII value of the jthjth zero-indexed 
character in SS. The absolute value of some integer xx is written as | x || x |.

*******/

package com.hackerRank.domain.algo.strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FunnyString {
	
	private static String FUNNY = "Funny";
	private static String NOT_FUNNY = "Not Funny";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer testCases = Integer.parseInt(sc.nextLine());
		char chars[], revChars[];
		StringBuilder str ;
		List <String> resltList = new ArrayList<String>();
		for (int i = 0; i < testCases; i++) {
			str = new StringBuilder(sc.nextLine());
			chars = str.toString().toCharArray();
			revChars = str.reverse().toString().toCharArray();
			resltList.add(getStringType(chars,revChars));
		}
		sc.close();
		for (Iterator<String> iterator = resltList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	private static String getStringType(char[] chars, char[] revChars) {
		boolean flag = true;
		int revDiff, actDiff;
		for (int i = 1; i < revChars.length; i++) {
			actDiff = Math.abs(chars[i]-chars[i-1]);
			revDiff = Math.abs(revChars[i]-revChars[i-1]);
			if(actDiff!=revDiff)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			return FUNNY;
		else
			return NOT_FUNNY;
	}
}

