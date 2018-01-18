package com.stackthread.techiedelight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Find pair with given sum in an array
 * 
 * @author nverma4
 *
 */
public class Problem1PairWithGivenSum {

	// space complexity: O(n), time complexity: O(n)
	public static void main(String[] args) {
		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		printPair(arr, sum);
		printAllPairs(arr, sum);
	}

	/**
	 * no duplicates allowed in this logic, if you have duplicate this logic wont
	 * work for duplicate logic, instead of set of Integer, you can use digit and
	 * count, and decrement the count once you choose it for the pair
	 * 
	 * @param arr
	 * @param sum
	 */
	public static void printPair(int[] arr, int sum) {
		Integer pair1 = null, pair2 = null;
		int idx1 = 0, idx2 = 0;
		boolean isPairFound = false;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(sum - arr[i])) {
				idx1 = i;
				isPairFound = true;
				pair1 = arr[i];
				pair2 = sum - arr[i];
				break;
			}
		}
		if (isPairFound) {
			for (int i = 0; i < arr.length; i++) {
				if (pair2 != null && arr[i] == pair2) {
					idx2 = i;
					break;
				}
			}
		}
		if (isPairFound)
			System.out.println("pair:(" + pair1 + "," + pair2 + ") found at indices:(" + idx1 + "," + idx2 + ")");
		else
			System.out.println("No pair found at indices");
	}

	public static void printAllPairs(int[] arr, int sum) {
		List<SumPair> pairs = new ArrayList<SumPair>();
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(sum - arr[i])) {
				SumPair pair = new SumPair();
				pair.setLeft(arr[i]);
				pair.setRight(sum - arr[i]);
				pairs.add(pair);
			}
		}

		if (!pairs.isEmpty())
			System.out.println(pairs);
		else
			System.out.println("No pair found at indices");
	}
}

class SumPair {
	private int left, right;

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "pair:(" + left + "," + right + ") found ";
	}
}
