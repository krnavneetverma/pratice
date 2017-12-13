package com.stackthread.bitwise;

public class AddingNumWithoutOperators {

	public static void main(String[] args) {
		System.out.println(add(8,0));
	}
	
	static int add(int x, int y)
	{
		int c;
		while(y!=0)
		{
			c=x&y;
			x=x^y;
			y=c<<1;
		}
		return x;
	}
}
