package com.stackthread.nokia;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AbsoluteDifference {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nbrOfquestions = Integer.parseInt(br.readLine());
        String aStrArr[] = br.readLine().split(" ");
        String bStrArr[] = br.readLine().split(" ");
        int thVal = Integer.parseInt(br.readLine());//threshold value
        int marks = 0;
        int count = 0 ;
        
        //no questions are answered
        for (int i = 0; i < nbrOfquestions; i++) {
           marks = Integer.parseInt(aStrArr[i]);
        	if(marks <thVal)
        		count++;
        	marks = Integer.parseInt(bStrArr[i]);
        	if(marks <thVal)
        		count++;
        }
        
        Integer marksOfA[], marksOfB[];
        for (int i = 1; i < nbrOfquestions; i++) { //choose number of questions to compare
        	marksOfA = new Integer[i];
        	
        	for (int j = 1; j < nbrOfquestions; j++) {//choose i numbers from a
        		getMarks(marksOfA,aStrArr); 
        		marksOfB = new Integer[i];
            	    
        		marks = Integer.parseInt(aStrArr[i]);
        	}
        }
        
        System.out.println(count);
	}

	private static void getMarks(Integer[] marksOfA, String[] aStrArr) {
		
	}
}
