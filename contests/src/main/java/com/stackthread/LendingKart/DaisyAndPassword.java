package com.stackthread.LendingKart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DaisyAndPassword {

	static String POSSIBLE = "Possible";
	static String IMPOSSIBLE = "Impossible";

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String lineArr[];
		int nTestCases = Integer.parseInt(line);
		boolean[] rsltArr = new boolean[nTestCases];

		for (int i = 0; i < nTestCases; i++) {
			lineArr = br.readLine().split(" ");
			String s = lineArr[0];
			String p = lineArr[1];
			rsltArr[i] = isPossiblePassword(s, p);
		}

		for (int i = 0; i < rsltArr.length; i++) {
			System.out.println(rsltArr[i] ? POSSIBLE : IMPOSSIBLE);
		}
	}

	private static boolean isPossiblePassword(String s, String p) {
		String ns = p.replace(s, "");
		if (p.length() > 60 || s.length() > 60)
			return false;
		if (p.length() < 1 || s.length() < 1)
			return false;
		if (s.length() != p.length() / 2)
			return false;
		if (ns.equals(s) || "".equals(ns))
			return true;
		else
			return false;
	}
}