package com.poc.practice;

public class XOR {

	public static void main(String[] args) {
		int []a = {8,3,4,4,3,8,8};
		int res = 0,tmp=0;
		for (int i = 0; i < a.length; i++) {
			tmp =a[i]; 
			res^=tmp;
		}
		System.out.println(res);
	}
}
