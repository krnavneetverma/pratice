package com.stackthread.LendingKart;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RodAndCutting {

	public static void main(String[] args) throws Exception {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			int nTestCases = Integer.parseInt(line);
			int[] rsltArr = new int[nTestCases];
			int lenOfRod;
			for (int i = 0; i < nTestCases; i++) {
				lenOfRod = Integer.parseInt(br.readLine());
				rsltArr[i] = getNbrOfSpecialCases(lenOfRod);
			}

			for (int i = 0; i < rsltArr.length; i++) {
				System.out.println(rsltArr[i]);
			}
		}

	private static int getNbrOfSpecialCases(int lenOfRod) {
		int  spclCases = 0;
		
		if(lenOfRod == 3 || lenOfRod == 5 || lenOfRod == 6
				||lenOfRod == 9 )
			spclCases = 1;
		else
		{
			spclCases = getSpclNumRemainder(lenOfRod);
		}
		return spclCases;
	}

	private static int getSpclNumRemainder(int lenOfRod) {
		int powerOfTwo = 0;
		int number = 1;
		int reslt = 0;
		while(lenOfRod>number && lenOfRod!=number)
		{
			powerOfTwo++;
			number = (int) Math.pow(2, powerOfTwo);
		}
		if(lenOfRod != number)
		{
			reslt = (lenOfRod % number) -1;
		}
		return reslt;
	}

}
