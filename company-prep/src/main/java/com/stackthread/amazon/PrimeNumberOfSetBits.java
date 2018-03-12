package com.stackthread.amazon;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given two integers ‘L’ and ‘R’, write a program that finds the count of
 * numbers having prime number of set bits in their binary representation in the
 * range [L, R].
 * 
 * Input: The first line consists of an integer T i.e number of test cases. The
 * first and only line of each test case consists of two integers L and R.
 * 
 * Output: Print the required output.
 * 
 * Constraints: 1<=T<=100 1<=L<=R<=100000
 * 
 * Example: Input: 2 6 10 10 15
 * 
 * Output: 4 5
 * 
 * @author nverma4
 *
 */
public class PrimeNumberOfSetBits {

	public static void main(String[] args) {
		int in = 1;
		// get prime map
		Map primes = getPrimeMap();
		// count Bits in number
		int bitCount = 0;
		bitCount = getSetBitCount(in);
		System.out.println(primes.get(bitCount) != null ? true : false);
	}

	private static Map getPrimeMap() {
		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();// 2**17>0.1M
		map.put(2, true);
		map.put(3, true);
		map.put(5, true);
		map.put(7, true);
		map.put(11, true);
		map.put(13, true);
		map.put(17, true);
		map.put(19, true);
		return map;
	}

	private static int getSetBitCount(int in) {
		int count = 0, idx = 0;
		int bit = 0;
		while (in > 0) {
			bit = (1 << idx) & in;
			if (bit != 0) {
				count++;
			}
			in -= bit;
			idx++;
		}
		return count;
	}
}
