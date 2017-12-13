package com.stackthread.chargeBee;

import java.util.HashSet;

public class PowerSum {

	public static void main(String[] args) {
		System.out.println(countPowerNumbers(25,30));
	}

	static int countPowerNumbers(int l, int r) {
		int count = 0;
		while(l<=r)
		{
			if(l<2)
			{
				count++;
				l++;
				continue;
			}
			if(isPowerNumber(l))
				count++;
			l++;
		}
		return count;
	}
	static boolean isPowerNumber(int num)
	{
		boolean flag = false;
		if(num==2)
			return true;
		HashSet<Long> set = new HashSet<Long>();
		set.add(0L);
		set.add(1L);

		for (int x = 2; x < Math.sqrt(num); x++) {
			int logX = (int)Math.ceil(Math.log(num)/Math.log(x));
			if(flag)
				break;
			for (int y = 2; y <= logX; y++) {
				long tmp = (long) Math.pow(x, y);
				if(set.contains(num-tmp)||tmp*2==num)
				{
					flag=true;
					break;
				}
				set.add(tmp);
			}
		}
		return flag;
	}
}
