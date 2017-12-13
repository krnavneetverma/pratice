/**
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of a given number N?

Input Format 
First line contains T, the number of test cases. This is followed by T lines each containing an integer N.

Output Format 
For each test case, display the largest prime factor of N.

Constraints 
1<=T<=10 
10<=N<=1012
*/

package com.stackthread;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3LargestPrimeFactor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //List<Long> lpfList = findLargestPrimeFactorOptimized();
        List<Long> lpfList = findLargestPrimeFactor();
		for(Long factor : lpfList)
			System.out.println(factor);
		
    }
    
    public static  List<Long> findLargestPrimeFactor()
	{
		List<Long> lpfList = new ArrayList<Long>();
	    Long numm = 0L;
		Short nTestCases = 0;
		Short cTestCase = 0;
		Scanner sc = new Scanner(System.in);
		nTestCases = sc.nextShort();
		while(cTestCase < nTestCases)
		{
			numm = sc.nextLong();
			long[] factors = new long[2];
			long largestFact = 0;
			for (long i = 2; i * i < numm; i++) {
			    if (numm % i == 0) { 
			        factors[0] = i;
			        factors[1] = numm / i;
			 
			        for (int k = 0; k < 2; k++) {
			            boolean isPrime = true;
			            for (long j = 2; j * j <  factors[k]; j++) {
			                if (factors[k] % j == 0) {
			                    isPrime = false;
			                    break;
			                 }
			             }
			             if (isPrime && factors[k] > largestFact) {
			                largestFact = factors[k];
			               
			            }
			        }
			    }
			}
			if(largestFact==0)
				lpfList.add(numm);
			else
				lpfList.add(largestFact);
			cTestCase++;
		}
		sc.close();
		return lpfList;
	}	    
    
    public static  List<Long> findLargestPrimeFactorOptimized()
	{
		List<Long> lpfList = new ArrayList<Long>();
	    Long num = 0L,leastPrime = 2L,largestFactor =0L;
		Short nTestCases = 0;
		Short cTestCase = 0;
		Scanner sc = new Scanner(System.in);
		nTestCases = sc.nextShort();
		while(cTestCase < nTestCases)
		{
			num = sc.nextLong();
			while(leastPrime*leastPrime<num)
			{
				if(num%leastPrime == 0)
				{
					largestFactor = leastPrime;
					num = num/leastPrime;
				}
				else
					leastPrime = (leastPrime == 2) ? 3 : leastPrime + 2;
			}
			if(largestFactor<num)
				largestFactor = num;
			
			lpfList.add(largestFactor);
			cTestCase++;
		}
		sc.close();
		return lpfList;
	}
}