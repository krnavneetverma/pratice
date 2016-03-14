package com.poc.bitwise;public class BitwiseOperations {

	public static void main(String[] args) {
		
		xorOfTwoDifferentNumbersIsSum(12,33);
		xorOfTwoSameNumbersIsZero(2,2);
		
	}

	/**
	 * xor sum of 2 different numbers
	 * @param i
	 * @param j
	 */
	private static void xorOfTwoDifferentNumbersIsSum(int i, int j) {

		int xor = i^j;
		System.out.println(""+i+" xor(^) "+j+" = "+xor);
	}

	/**
	 * xor of two same numbers is always zero
	 * @param i
	 * @param j
	 */
	private static void xorOfTwoSameNumbersIsZero(int i, int j) {
		int xor = i^j;
		System.out.println(""+i+" xor(^) "+j+" = "+xor);
	}

}
