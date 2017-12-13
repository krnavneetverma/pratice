package com.stackthread.misc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TheUtopianTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int hightOfTree = 1;
		int growthCycles = 0;
		
		String line = sc.nextLine();
		int nbrOfTestCases = Integer.parseInt(line);
		
		for (int i = 0; i < nbrOfTestCases; i++) {
			line = sc.nextLine();
			growthCycles = Integer.parseInt(line);
			list.add(getHeightOfTreeAfterGrowthCycles(growthCycles,hightOfTree));
		}

		sc.close();
		
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	private static Integer getHeightOfTreeAfterGrowthCycles(int growthCycles,int hightOfTree) {
		int grownUpHeight = 0;
		grownUpHeight = hightOfTree;
		for (int i = 0; i < growthCycles; i++) {
			if(i%2==0)
			{
				grownUpHeight*=2;
			}
			else
			{
				grownUpHeight+=1;
			}
		}
		return grownUpHeight;
	}
}
