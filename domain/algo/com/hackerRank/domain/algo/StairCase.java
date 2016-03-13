package com.hackerRank.domain.algo;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int heightOfStairCase = sc.nextInt();
		
		printStairCase(heightOfStairCase);
		
		sc.close();
	}

	private static void printStairCase(int heightOfStairCase) {
		
		int printSpaces, printTag;
		
		for (int i = 1; i <= heightOfStairCase; i++) {
			printSpaces = heightOfStairCase -i; 
			printTag =  i;
			//print Spaces
			for (int j = 1; j <= printSpaces ; j++) {
				System.out.print(" ");
			}
			
			//print Tag
			while(printTag>0)
			{
				System.out.print("#");
				printTag--;
			}
			System.out.println();
		}
		
	}
}
