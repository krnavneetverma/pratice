/**
https://projecteuler.net/problem=5
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
**/
package com.stackthread;

/**
 * Its nothing but asking for LCM
 * 
 * @author nverma4
 *
 */
public class Problem5SmallestMultiple {

	public static void main(String[] args) {
		int lastNum = 1170;
		System.out.println(calculateSmallestMultiple(lastNum));
	}

	private static long calculateSmallestMultiple(int lastNum) {
		long lcm = 1;
		for (int i = 1; i <= lastNum; i++) {
			lcm = getLCM(lcm, i);
		}
		return lcm;
	}

	/**
	 * 
	 * @param lcm
	 * @param i
	 * @return
	 */
	private static long getLCM(long lcm, int i) {
		long gcd = 1;
		gcd = getGCD(lcm, i);
		lcm = (lcm * (i)) / gcd;
		return 0;
	}

	/**
	 * Euclidean algo
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static long getGCD(long a, long b) {
		if (a == 0)
			return b;
		return getGCD(b % a, a);
	}
}
