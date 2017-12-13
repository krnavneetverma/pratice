package com.stackthread.edgeVerve;

import java.util.Scanner;

public class BrowserCache {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cacheSize = sc.nextInt();
		String [] dataArr = sc.next().split("!");
		sc.close();
		displayCacheElementList(cacheSize,dataArr);
	}

	private static void displayCacheElementList(int cacheSize, String[] dataArr) {
		StringBuilder cache = new StringBuilder();
		String data; 
		int dataLen;
		for (int i = 0; i < dataArr.length; i++) {
			data = dataArr[i];
			cache.append(data);
			dataLen = cache.length() - cacheSize;
			if(dataLen>0)
			{
				cache.delete(0, dataLen);
			}
			System.out.print(cache+" ");
//			if(!(i==dataArr.length-2))
//				System.out.print(" ");
		}
	}
}
