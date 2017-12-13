package com.stackthread.codaAgon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JesseAndTheRocks {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String ipStrArr[] = br.readLine().split(" ");
        long nbrOfRocks = Long.parseLong(ipStrArr[0]);
        long jStrength = Long.parseLong(ipStrArr[1]);
        String rockPowStrArr [] = br.readLine().split(" ");
        long nbrOfRocksBroken = 0;
        long skippedRocks = 0;
        long rockStrngth = 0;
        
        for (int i = 0; i < nbrOfRocks; i++) {
        	
        	rockStrngth = Long.parseLong(rockPowStrArr[i]);
        	if(rockStrngth<=jStrength)
        	{
        		nbrOfRocksBroken++;
        		if(skippedRocks>1)
        			break;
        	}
        	else 
        	{
        		skippedRocks += 1;
        	}
        	if(skippedRocks>1)
    			break;
		}
        System.out.println(nbrOfRocksBroken);
	}	

}
