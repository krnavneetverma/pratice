package com.poc.bitwise;public class BitwiseOperations {

	public static void main(String[] args) {
		
		xorOfTwoDifferentNumbersIsSum(43,33);
		xorOfTwoSameNumbersIsZero(2,2);
		complementOfInteger(2147483647);
	}

	private static void complementOfInteger(long i) {		long ci = (1<<32);		long cii = 1<<34;		Long l = 232342342342L;		Byte b = l.byteValue();		System.out.println(ci+","+cii);			}	/**
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
