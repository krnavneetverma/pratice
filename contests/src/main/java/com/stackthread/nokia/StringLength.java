package com.stackthread.nokia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength {
	
	public static void main(String[] args) throws IOException {
	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int nTestCases = Integer.parseInt(line);
        Integer []strLenghts = new Integer[nTestCases];

        for (int i = 0; i < nTestCases; i++) {
        	strLenghts[i] = br.readLine().length();
        }
        
        for (int i = 0; i < nTestCases; i++) {
			System.out.println(strLenghts[i]);
		}

	}

}
