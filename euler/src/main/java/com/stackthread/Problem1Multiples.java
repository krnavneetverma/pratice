/**
 * 
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.

Input Format 
First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

Output Format 
For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.

Constraints 
1<=T<=105 
1<=N<=109
 */

package com.stackthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1Multiples {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        Integer nTestCases = 0;
        Long nbr = 0L;
        Long currTestCase = 0L;
        List<Long> sum = null;
        Long lastTerm = 0L;
		Long tmp = 0L;
        nTestCases = sc.nextInt();
        sum = new ArrayList<Long>();
        while(currTestCase<nTestCases)
        {
        	
        	nbr = sc.nextLong();
        	nbr--;
        	lastTerm = (nbr/3)*3; 
        	//AP series (first+last)*(number_of_Terms/2)
        	tmp = (3+lastTerm)*(nbr/3)/2;
        	
        	lastTerm = (nbr/5)*5; 
        	tmp += (5+(nbr/5)*5)*(nbr/5)/2;
        	
        	lastTerm = (nbr/15)*15;
        	tmp -= (15+(nbr/15)*15)*(nbr/15)/2;
        	
            currTestCase++;
            sum.add(tmp);
        }
        for(Long num : sum)
        {
            System.out.println(num);
        }    
        sc.close();   
    }
}
