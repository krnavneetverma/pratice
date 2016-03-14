package com.hackerEarth.challenges;

import java.util.Scanner;

public class PartitionFunction {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(PartitionCount(600,1));
		sc.close();
	}
	
	public static int PartitionCount(int num, int partitions)
	{
		if(partitions>num)
			return 0;
		if(num==partitions)
			return 1;
		return PartitionCount(num, partitions+1) + PartitionCount(num - partitions, partitions);
	}

}
