package com.stackthread;

public class Problem6SumSquareDifference {

	public static void main(String[] args) {
		int n = 10;
		long seqSqSeriesSum = n * (n + 1) * (2 * n + 1) / 6;
		long seqSumSq = n * (n + 1) / 2;
		long result = seqSumSq * seqSumSq - seqSqSeriesSum;
		System.out.println(result);
	}
}
