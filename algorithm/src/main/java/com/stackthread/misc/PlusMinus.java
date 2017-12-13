package com.stackthread.misc;

import java.util.Scanner;

public class PlusMinus {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int totalNbrs = 0;
	        String line, strRow[];
	        int pNbrs=0, nNbrs=0, zNbrs=0, nbr=0 ;
	        float fraction ;
	        
	        line = in.nextLine();
	        totalNbrs = Integer.parseInt(line);
	        
	        line = in.nextLine();
	        strRow = line.split(" ");
	        
	        for (int i = 0; i < strRow.length; i++) {
				
				nbr = Integer.parseInt(strRow[i]);
				if(nbr<0)
				{
					nNbrs++;
				}
				else if(nbr>0)
				{
					pNbrs++;
				}
				else
					zNbrs++;
			}
	        
	        fraction= (float)pNbrs/totalNbrs;
	        System.out.println(String.format("%.6f",fraction));
	        
	        fraction= ((float)nNbrs/totalNbrs);
	        System.out.println(String.format("%.6f",fraction));
	        
	        fraction= (float)zNbrs/totalNbrs;
	        System.out.println(String.format("%.6f",fraction));
	        
	        in.close();
	    }
}
