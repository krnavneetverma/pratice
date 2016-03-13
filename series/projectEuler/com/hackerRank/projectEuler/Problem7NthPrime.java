package com.hackerRank.projectEuler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Strategy:
/**
 * to find the prime number, increment by odd numbers,
 * and check the divisiblity of number by prime numbers only.
 * if number is divisible by any of prime number identified before it, 
 * its not prime.
 * 
 * @author NVerma
 *
 */
public class Problem7NthPrime {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int nthCounter = Integer.parseInt(sc.nextLine());
		sc.close();
		List <Integer> primeList = new ArrayList<Integer>();
		long start = System.currentTimeMillis();
		primeList.add(2);
		int currNbr = 1, idx = 0, prime ;
		boolean isPrime =true;
		while(primeList.size() < nthCounter)
		{
			idx = 0;
			isPrime = true;
			currNbr += 2;
			prime = primeList.get(idx);
			
			while(prime*prime <= currNbr)
			{
				if(currNbr%prime == 0)
				{
					isPrime = false;
					break;
				}
				idx++;
				prime = primeList.get(idx);
			}
			
			if(isPrime)
			{
				primeList.add(currNbr);
			}
		}
		System.out.println(nthCounter+" prime is :"+primeList.get(nthCounter-1));
		long end = System.currentTimeMillis();
		System.out.println("Total Time taken: "+(end-start)/1000.0 +"seconds");
	}
}
