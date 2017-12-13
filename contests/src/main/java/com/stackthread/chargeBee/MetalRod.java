package com.stackthread.chargeBee;

import java.util.Arrays;

public class MetalRod {

	public static void main(String[] args) {
		int arr[]={26,103,59};
		System.out.println(maxProfit(100,10,arr));
	}

	static int maxProfit(int cost_per_cut, int metal_price, int[] lengths) {
		int maxProfit = 1, len = 1,lenIdx = 0, cost = 0, maxLen;
		Arrays.sort(lengths);
		maxLen = lengths[lengths.length-1];
		while (len <= maxLen) {
			cost = 0;
			for (int i = lenIdx; i < lengths.length; i++) {
				cost = (metal_price * len) * (lengths[i] / len)
						- (cost_per_cut * (lengths[i] / len)) + cost;
			}
			len++;
			for (int j = 0; j < lengths.length; j++) {
				if (len > lengths[j])
					lenIdx = j;
			}
			if (cost > maxProfit)
				maxProfit = cost;
		}
		return maxProfit;
	}

}
