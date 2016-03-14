package com.hackerEarth.challenges;

public class Knot {
	
	public static void main(String[] args) {
		
		int[] lengthOfThreads = {2,1,6,3};
		
		System.out.println(calculateCostForThreadKnot(lengthOfThreads));
	}

    static int calculateCostForThreadKnot(int[] lengthOfThreads) {
       	int cost = 0, tmp = 0, sum =0;
    	    	
    	for(int i = 0; i<lengthOfThreads.length; i++)
    	{
    		for(int j = i; j<lengthOfThreads.length; j++)
    		{
    			if(lengthOfThreads[i]>lengthOfThreads[j])
    			{
    				tmp = lengthOfThreads[i];
    				lengthOfThreads[i]=lengthOfThreads[j];
    				lengthOfThreads[j]=tmp;
    			}
    		}
    	}
    	
    	for (int i = 0; i < lengthOfThreads.length; i++) {
    		sum  = sum + lengthOfThreads[i];
    		lengthOfThreads[i] = sum;
		}
    	for (int i = 1; i < lengthOfThreads.length; i++) {
			cost = cost + lengthOfThreads[i];
		}

    	return cost;
    }

    
}
