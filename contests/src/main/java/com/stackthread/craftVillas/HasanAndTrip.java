package com.stackthread.craftVillas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class HasanAndTrip {
    public static void main(String args[] ) throws Exception {
      	
      	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String line2 [], preLine[] = null ;
		int N = Integer.parseInt(line);
		HasanAndTrip obj = new HasanAndTrip();
		Double happiness = 0.0, dist = 0.0;
		int x1,y1, x2, y2;
	
		for (int i = 0; i < N; i++)
		{
			
			line2 = br.readLine().split(" ");
			if(i==0)
			{
				preLine = line2;
				happiness = Double.parseDouble(line2[2]);
				continue;
			}
			
			x1 = Integer.parseInt(preLine[0]);
			y1 = Integer.parseInt(preLine[1]);
			
			x2 = Integer.parseInt(line2[0]);
			y2 = Integer.parseInt(line2[1]);
			
			happiness += Integer.parseInt(line2[2]);
			dist += obj.distanceTravelled( x1,y1,x2,y2);
			preLine = line2;
		}
		System.out.println(round(happiness - dist,6)+"");
    }
    
    private double distanceTravelled(int x1,int y1, int x2, int y2)
	{
		Double xSq = Math.pow((x1-x2), 2);
		Double ySq = Math.pow((y1-y2), 2);
		return Math.sqrt(xSq + ySq);
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
 
	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
 
}