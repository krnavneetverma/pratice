package com.stackthread.thoughtWorks;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int nTestCases = sc.nextInt();
		sc.nextLine();
		String str[] = new String[nTestCases];
		int arr[] = new int[nTestCases];
		str = sc.nextLine().split(" ");
		sc.close();

		for (int l = 0; l < str.length; l++) {
			arr[l] = Integer.parseInt(str[l]);
		}
		int l = 0;

		for (int i = 0; i < nTestCases; i++) {
			for (int k = 1; k <= arr[l]; k++) {
				if (k % 3 == 0 && k % 5 == 0) {
					System.out.println("FizzBuzz");
				} else if (k % 3 == 0) {
					System.out.println("Fizz");
				} else if (k % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(k);
				}
			}
			l++;
		}
	}
}
