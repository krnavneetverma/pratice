package com.stackthread.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Add2LinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new LinkedList<Integer>();
		List<Integer> l2 = new LinkedList<Integer>();
		
		l1.add(5);
		l1.add(6);
		l1.add(3);
		
		l2.add(8);
		l2.add(4);
		l2.add(2);
		
		Integer carry=0;
		StringBuilder sum = new StringBuilder();
		carry = getSummedLinkedLIst(l1.iterator(),l2.iterator(),sum,carry,l1.size()+l2.size());
		sum.append(carry).reverse();
		List<Integer> list = createList(sum.toString().toCharArray());
		
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			System.out.print(iterator.next());
			if(iterator.hasNext())
			{
				System.out.print("-->");
			}
		}
		
	}

	private static List<Integer> createList(char[] cs) {
		List<Integer> l1 = new LinkedList<Integer>();
		for (char ch: cs) {
			l1.add(Integer.parseInt(ch+""));
		}
		return l1;
	}

	public static int getSummedLinkedLIst(Iterator<Integer>l1, Iterator<Integer> l2,
			StringBuilder sum, Integer carry, int listSize) {
		Integer v1 = 0, v2 = 0;
		Integer tmpSum=0,unit = 0;

		if(l1.hasNext() && l2.hasNext())
		{
			v1=l1.next();
			v2=l2.next();
			carry = getSummedLinkedLIst(l1,l2,sum,carry,listSize-2);
		}
		
		if(l1.hasNext())
		{
			v1=l1.next();
			carry = getSummedLinkedLIst(l1,l2,sum,carry,listSize-1);
		}
		
		if(l2.hasNext())
		{
			v2=l2.next();
			carry = getSummedLinkedLIst(l1,l2,sum,carry,listSize-1);
		}
		if(listSize == 0)
		{
			return carry;
		}
		
		tmpSum = v1+v2+carry;
		unit = tmpSum%10;
		carry = tmpSum/10;		
		sum.append(unit);
		
		return carry;
	}

}
