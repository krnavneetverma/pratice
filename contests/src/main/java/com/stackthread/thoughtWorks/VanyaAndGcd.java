package com.stackthread.thoughtWorks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VanyaAndGcd {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int arraySize = Integer.parseInt(line);
		int array[] = new int[arraySize];
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < arraySize; i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		System.out.println(getCountOfMaxIncSeqs(array));
	}

	public static int getCountOfMaxIncSeqs(int[] arr) {
		int count = 0;
		List<Integer> gcdArr = new ArrayList<Integer>();

		ArrayList<ArrayList<Integer>> ipList = subsets(arr);
		ArrayList<Integer> list = null;
		for (int i = 0; i < ipList.size(); i++) {
			list = ipList.get(i);
				for (int ii = 1; ii < list.size(); ii++) {
					gcdArr.add(arr[ii]);
					for (int ij = 0; ij < ii; ij++) {
						if (arr[ij] < arr[ii]) {
							gcdArr.add(arr[ij]);
						}
					}
					if (findGcdOfArr(gcdArr) == 1)
						count++;
					gcdArr.removeAll(gcdArr);
				}

		}
		return count%1000000007;
	}

	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		if (S == null)
			return null;

		Arrays.sort(S);

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();

			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}

			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}

			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);

			result.addAll(temp);
		}

		result.add(new ArrayList<Integer>());

		return result;
	}

	public static int findGcdOfArr(List<Integer> arr) {
		int gcd = 0, tmpgcd = 0;
		if (arr.size() == 1)
			return arr.get(0);

		for (int i = 0; i < arr.size() - 1; i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				tmpgcd = findGcd(arr.get(i), arr.get(j));
				if (tmpgcd > gcd)
					gcd = tmpgcd;
			}
		}
		return gcd;
	}

	public static int findGcd(int num1, int num2) {
		int remainder = 0;
		while (num2 != 0) {
			remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		}
		return num1;
	}
}
