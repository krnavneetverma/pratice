package com.stackthread.onMobile;

interface Addition{
	public abstract int add(int a, int b);
}

interface Subtraction{
	public abstract int subtract(int a, int b);
}

public class Adder implements Addition,Subtraction
{

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		if(a>b)
			return a-b;
		else
			return b-a;
	}
    
}