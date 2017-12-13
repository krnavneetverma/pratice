package com.stackthread.nokia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MaxDistance {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer setCount = Integer.parseInt(br.readLine());
        String carSpeedsStr[] = br.readLine().split(" ");
        String carMileageStr[] = br.readLine().split(" ");
        Integer fuel = Integer.parseInt(br.readLine());
        Double maxDistance = 0.0, distanceTavelled = 0.0;
        
        Integer itrIdx = 0;
        while(itrIdx < setCount)
        {
        	int speed = Integer.parseInt(carSpeedsStr[itrIdx]);
        	int consumption = Integer.parseInt(carMileageStr[itrIdx]);
        	
        	distanceTavelled = 1.0*speed*fuel/consumption;
        	if(distanceTavelled>maxDistance)
        		maxDistance = distanceTavelled;
        	itrIdx++;
        }
        System.out.print(round(maxDistance));
	}
	public static double round(double d) {
	    return (long) (d * 1e3) / 1e3;
	}
	
	

}
