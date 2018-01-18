package com.stackthread;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which,
 * 
 * a^2 + b^2 = c^2 For example, 32 + 42 = 9 + 16 = 25 = 52.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * @author nverma4
 *
 */
public class Problem9SpecialPythagoreanTriplet {

	public static void main(String[] args) {
		int tripletSum = 100000000;
		printTripletBruteforce(tripletSum);
	}

	public static void printTripletBruteforce(int tripletSum) {
		int a = 0, b = 0, c = 0;
		boolean isFound = false;
		for (a = 1; a < tripletSum; a++) {
			for (b = a + 1; b < tripletSum; b++) {
				c = tripletSum - b - a;
				if ((a * a + b * b) == c * c) {
					isFound = true;
					break;
				}
			}
			if (isFound)
				break;
		}
		if (isFound) {
			System.out.println(String.format("Found triplet:(%s,%s,%s)", a, b, c));
			System.out.println(String.format("product of triplet:(%s)", (long)a*(long)b*(long)c));
		}
		else {
			System.out.println("No triplet Found ");
		}
	}
}
