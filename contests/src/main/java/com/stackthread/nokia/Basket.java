package com.stackthread.nokia; 

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basket {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line [] = br.readLine().split(" ");
        Integer r = Integer.parseInt(line[0]);
        Integer h = Integer.parseInt(line[1]);
        Double vol=0.0, bcktVol = 0.0, coneVol = 0.0, cyldrVol = 0.;
        
        bcktVol = calMaxBucketVolume(r,h);
        //TODO:
        // coneVol = calMaxConeVol(r,h);
        //cyldrVol = calCylndrVol(r,h);
        
        if(bcktVol>coneVol)
        {
        	if(cyldrVol>bcktVol)
        		vol = cyldrVol;
        	else
        		vol = bcktVol;
        }
        else if (coneVol>cyldrVol)
        {
        	vol = coneVol;
        }
        else
        	vol = cyldrVol;
        	
        
        System.out.println(round(vol));

	}

	private static Double calMaxBucketVolume(Integer  r, Integer h) {
		
		Double pi = 3.14159, R, H, vol = 0.0;
		
		R = r+h/1.73205; 
		H = h*0.81649;
		vol = pi*H*(R*R+R*r+r*r)/3;
		return (vol);	
	}
	
	public static double round(double d) {
	    return (long) (d * 1e2) / 1e2;
	}

}
