package com.stackthread.PharmEasy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiificultCharacter {

    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String word;
        List<String> reslt = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
        	
        	word = br.readLine();
        	reslt.add(getDiffcultLetterOrderedString(word));
        }

        for (Iterator<String> iterator = reslt.iterator(); iterator.hasNext();) {
			System.out.println( iterator.next());
		}
    }

	private static String getDiffcultLetterOrderedString(String word) {
		int chars[] = new int[26];
		StringBuilder sb = new StringBuilder();
		char[] ch = word.toCharArray();
		//frequencies
		for (int i = 0; i < ch.length; i++) {
			chars[ch[i]-97]++;
		}
		//indexing
		int sortedIdx[] = new int[26];
		int maxValue, idx =-1;
		for (int i = 0; i < chars.length; i++) {
			maxValue = -1;
			for (int j = 0; j < chars.length; j++) {
				if(maxValue<chars[j])
				{
					maxValue = chars[j];
					idx=j;
				}
			}
			chars[idx]=-1;
			sortedIdx[i]=idx;
		}
		for (int i = sortedIdx.length-1; i >=0 ; i--) {
			
			sb.append((char) (97+sortedIdx[i])+" ");
		}
		return sb.toString().trim();
	}
}
