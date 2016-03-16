package com.hackerRank.domain.algo.bitManipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FlippingBits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		BigInteger origNum ;
		List<BigInteger> rsltList = new ArrayList<BigInteger>();
		for (int i = 0; i < testCases; i++) {
			origNum = new BigInteger(sc.nextLine());
			rsltList.add(getFlippedNum(origNum));
		}
		sc.close();
		
		for (Iterator<BigInteger> iterator = rsltList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
	}

	private static BigInteger getFlippedNum(BigInteger origNum) {
		BigInteger flippedNum, tmp;
		tmp = BigInteger.ZERO;
		tmp = tmp.flipBit(32).subtract(BigInteger.ONE);
		flippedNum = origNum.xor(tmp);
		return flippedNum;
	}//2147483647
}
