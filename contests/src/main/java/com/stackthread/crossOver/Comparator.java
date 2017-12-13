package com.stackthread.crossOver;

import java.util.Arrays;

public class Comparator {

	boolean compare(int a, int b)
	{
		return a==b;
	}
	boolean compare(String a, String b)
	{
		return a.equals(b);
	}
	boolean compare(int[] a, int[] b)
	{
		return Arrays.equals(a, b);
	}
	
}

