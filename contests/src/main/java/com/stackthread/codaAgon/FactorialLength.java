package com.stackthread.codaAgon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FactorialLength {

	public static void main(String[] args) {
		Set<Integer> ipSet = new HashSet<Integer>();
		ipSet.add(1);
		ipSet.add(2);
		ipSet.add(3);
		
		System.out.println(powerSet(ipSet));
	}
	public static void main1(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
        String ipStrArr[] = br.readLine().split(" ");
        
		Set<Integer> ipSet = getSet(ipStrArr);
		Set<Set<Integer>> allSubSets= powerSet(ipSet);
		long sumOfSetFactLen = 0, sum= 0;
		for (Iterator<Set<Integer>> iterator = allSubSets.iterator(); iterator.hasNext();) {
			Set<Integer> subSet = (Set<Integer>) iterator.next();
			if(subSet.isEmpty())
				continue;
			sum = getFactLengthSum(subSet);
			if(sum%2==0)
				sumOfSetFactLen +=sum ;
		}
		System.out.println(sumOfSetFactLen);

	}
	
	private static long getFactLengthSum(Set<Integer> subSet) {
		long sum = 0;
		long powerToKey = 0;
		int fact = 0; 
		for (Iterator<Integer> iterator = subSet.iterator(); iterator.hasNext();) {
			Integer key = (Integer) iterator.next();
			fact = getFactorial(key);
			powerToKey = getFactLength(fact);
			sum+=powerToKey;
		}
		return sum;
	}

	private static int getFactorial(Integer key) {
		int fact = 1;
		if(key==0)
			fact = 1;
		else
			for (int i = 1; i <= key; i++) {
				fact*=i;
			}
		return fact;
	}

	private static int getFactLength(Integer key) {
		int powerToKey = 0;
		int nextPrime = 0,pow =0;
		
		if(key==0 || key == 1 || key ==2)
		{
			pow = 1;
			return pow;
		}
		while(key>1)
		{
			nextPrime= getNextPrime(nextPrime);
			while(key%nextPrime==0)
			{//factor
				powerToKey++;
				key=key/nextPrime;
			}
		}
		return powerToKey;
	}

	private static int getNextPrime(int nextPrime) {
		boolean isPrime = false;
		int sqrt = 0;
		if(nextPrime<2)
		{
			nextPrime = 2;
		}
		else if(nextPrime ==2)
		{
			nextPrime = 3;
		}
		else
		{
			if(nextPrime%2==0)
				nextPrime--;
			while(!isPrime)
			{
				nextPrime+=2;
				sqrt = (int) Math.sqrt(nextPrime);
				isPrime = true;
				for (int i = 2; i <=sqrt ; i+=2) {
					if(nextPrime%i==0) {isPrime = false;break;}
				}
			}
		}
		return nextPrime;
	}

	private static Set<Integer> getSet(String[] ipStrArr) {
		Set <Integer> set = new HashSet<Integer>();
		for (int i = 0; i < ipStrArr.length; i++) {
			set.add(Integer.parseInt(ipStrArr[i]));
		}
		return set;
	}

	public static Set<Set<Integer>> powerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<Integer>());
            return sets;
        }
        List<Integer> list = new ArrayList<Integer>(originalSet);
        Integer head = list.get(0);
        Set<Integer> rest = new HashSet<Integer>(list.subList(1, list.size()));
        for (Set<Integer> set : powerSet(rest)) {
            Set<Integer> newSet = new HashSet<Integer>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}
