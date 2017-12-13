package com.stackthread.crossOver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class myCalculator {

	public int power(int n, int p) {
		// TODO Auto-generated method stub
		return -1;
		
	}
}

public class Solution{
		
		public static void main(String []arg)
		{
	        Scanner sc = new Scanner(System.in);
	        int n = 0,p = 0;
	        String line[] ;
	        myCalculator obj = new myCalculator();
	        List<Integer> reslt = new ArrayList<Integer>();
	        do
	        {
	        	
	        	line = sc.nextLine().split(" ");
	        	n = Integer.parseInt(line[0]);
	        	p = Integer.parseInt(line[1]);
	        	try {
	        		reslt.add(obj.power(n,p));
				} catch (Exception e) {
					reslt.add(-1);
				}
	        	
	        }while(sc.hasNextLine());
	        sc.close();
	        
	        for (int i = 0; i < reslt.size(); i++) {
				if(reslt.get(i)==-1)
				{
					System.out.println("java.lang.Exception: n and p should be non-negative");
				}
				else
					System.out.println(reslt.get(i));
			}
	        
	    }

}
