package com.am.practice.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Complete the function below.
 */
public class DecimalBinary {
	
	public static void main(String[] args) {
		int a[]={31,15,14,7,8,1};
		swap_array(a);
	}
	static void swap_array(int[] a) {
		int flag = 1, count = 0, num;
		List list = new ArrayList();
		Node node = null;
		for (int i=0; i<a.length; i++) {
			flag = 1;num = a[i];count = 0;
			
			while(num>=flag) {
				if ((num & flag) != 0)
					count++;
				flag <<= 1;
			}
			
			node = new DecimalBinary.Node(a[i], count);
			list.add(node);
		}
		//Collections.sort(list,new NodeComparator());
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

	static class NodeComparator implements Comparator
	{
		@Override
		public int compare(Object o1, Object o2) {
			int val = Integer.compare(((Node)o2).bCount,((Node)o1).bCount);
			if (val == 0)
				val = Integer.compare(((Node)o2).dVal,((Node)o1).dVal);
			return val;
		}
	}
	
	static class Node implements Comparable {
		int dVal;
		int bCount;

		public Node(int inDVal, int inBCount) {
			dVal = inDVal;
			bCount = inBCount;
		}

		@Override
		public String toString() {
			return String.valueOf(dVal);
		}
		@Override
		public int compareTo(Object o1) {
			int val = Integer.compare(((Node)o1).bCount,(this).bCount);
			if (val == 0)
				val = Integer.compare(((Node)o1).dVal,(this).dVal);
			return val;
		}
	}
}