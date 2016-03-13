package com.hackerRank.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SpiralMatrix {
	
	public static void main(String[] args) {
		int a[][] = { {1,  2,  3,  4,  5,  6},
		        {7,  8,  9,  10, 11, 12},
		        {13, 14, 15, 16, 17, 18}};
		List<Integer>list = getSpiralMatrixList(a, 3, 6);
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next()+",");
			
		}
	}

	private static List<Integer> getSpiralMatrixList(int[][] a, int m, int n) {
	
		 List<Integer> reslt = new ArrayList<Integer>();

		 int xMin=0,xMax=m-1, yMin=0,yMax=n-1;
		 int idx = 0;
		 
		 while(reslt.size()<m*n)
		 {
			 for(idx = yMin; idx<=yMax && reslt.size()<m*n; idx++)
				 reslt.add(a[xMin][idx]);
			 xMin++;
			 
			 for(idx=xMin;idx<=xMax && reslt.size()<m*n;idx++)
				 reslt.add(a[idx][yMax]);
			 yMax--;
			 
			 for(idx = yMax; idx>=yMin && reslt.size()<m*n; idx--)
				 reslt.add(a[xMax][idx]);
			 xMax--;
			
			 for(idx = xMax; idx>=xMin && reslt.size()<m*n; idx--)
				 reslt.add(a[idx][yMin]);
			 yMin++;
		 }
		 return reslt;
	}

}
