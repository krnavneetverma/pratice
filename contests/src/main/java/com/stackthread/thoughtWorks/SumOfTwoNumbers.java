package com.stackthread.thoughtWorks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumOfTwoNumbers {

	public static void main(String args[]) throws Exception {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();

		int nTestCases = Integer.parseInt(line);

		for (int i = 0; i < nTestCases; i++) {

			line = br.readLine();

			String str[] = new String[line.length()];

			str = line.split(" ");

			BigInteger a = new BigInteger(str[0]);

			BigInteger b = new BigInteger(str[1]);

			BigInteger c = new BigInteger("0");

			c = b.add(a);

			System.out.println(c);

		}

	}

}
