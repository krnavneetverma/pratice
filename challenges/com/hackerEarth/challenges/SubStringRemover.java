package com.hackerEarth.challanges;

import java.util.Scanner;

public class SubStringRemover {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String subStrs[] = sc.nextLine().split(" ");
		sc.close();
		
		System.out.println(removeSubtrings(0, str, subStrs).length());
	}

	private static String removeSubtrings(int idx,String str, String[] subStrs) {
		if(idx < subStrs.length && str.contains(subStrs[idx]))
		{
			str = str.replaceAll(subStrs[idx], "");
			str = removeSubtrings(0,str, subStrs);
		}
		else if (idx < subStrs.length -1 )
		{
			str = removeSubtrings(idx+1,str, subStrs);
		}
		return str;
	}
	

}
