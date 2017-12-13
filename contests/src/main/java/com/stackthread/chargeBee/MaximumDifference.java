package com.stackthread.chargeBee;

public class MaximumDifference {

	
	public static void main(String[] args) {
		int a[] ={}; 
		maxDifference(a);
	}
	
    static int maxDifference(int[] a) {
    	int tmpDif,maxDif,rMax;
    	
    	maxDif = Integer.MIN_VALUE;
    	rMax = a[a.length-1];
    	
    	for (int i = a.length-2; i >=0; i--) {
			if(a[i]>rMax){
				rMax = a[i];
			}
			else
			{
				tmpDif = rMax - a[i];
				if(tmpDif>maxDif)
						maxDif=tmpDif;
			}
		}
    	return maxDif;
    }

}
