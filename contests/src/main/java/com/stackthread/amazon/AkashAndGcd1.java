package com.stackthread.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AkashAndGcd1 extends Thread {
	//MOD value
	private static final int MOD = 1000000007;
	// memoization Map
	private static Map<Integer, Integer> fMemoMap = new HashMap<Integer, Integer>();
	// prime number seive
	private static boolean[] primes = new boolean[1000001];

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		AkashAndGcd1 obj = new AkashAndGcd1();
		Thread t1 = new Thread(obj);
		t1.start();

		Scanner sc = new Scanner(System.in);
		List<Integer> opList = new ArrayList<Integer>();

		// size of array
		int sizeOfArr = sc.nextInt();
		sc.nextLine();
		// input array
		int[] arr = new int[sizeOfArr];
		for (int i = 0; i < sizeOfArr; i++) {
			arr[i] = sc.nextInt();
		}
		sc.nextLine();
		// number of queries
		int nbrOfQueries = sc.nextInt();
		sc.nextLine();
		int queryRslt = 0;
		int x, y;
		for (int i = 0; i < nbrOfQueries; i++) {
			String query[] = sc.nextLine().split(" ");
			// find query result
			x = Integer.parseInt(query[1]) - 1;
			y = Integer.parseInt(query[2]);

			if ("C".equals(query[0])) {
				queryRslt = getQueryRslt(x, y, arr);
				opList.add(queryRslt);
			} else {
				arr[x] = y;
			}
		}
		// close resources
		sc.close();
		// display result list
		for (Iterator<Integer> iterator = opList.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
		}
		long ends = System.currentTimeMillis();
		System.out.println("\ntime taken:"+(ends - start));
	}

	private static int getQueryRslt(int x, int y, int[] arr) {
		int aggQuerysum = 0;
		int ithQueryRslt = 0;
		for (int i = x; i < y; i++) {
			if (fMemoMap.containsKey(arr[i])) {
				ithQueryRslt = fMemoMap.get(arr[i]);
			} else {
				// calculate f(i)
				ithQueryRslt = getCustomGCD(arr[i]);

				// memoization updates
				ithQueryRslt %= MOD;
				fMemoMap.put(arr[i], ithQueryRslt);
			}
			aggQuerysum += ithQueryRslt;
			aggQuerysum %= MOD;
		}
		return aggQuerysum;
	}

	private static int getCustomGCD(int num) {
		int sumGcd = 0;

		if (isNumPrime(num)) {
			return (2 * num - 1) % MOD;
		}

		for (int j = 1; j <= num; j++) {
			sumGcd += findGcd(j, num);
			sumGcd %= MOD;
		}
		return sumGcd;
	}
	
	private static int findGcd(int num1, int num2)
	{
		int remainder = 0;
		while(num2!=0){
			remainder = num1%num2;
			num1=num2;
			num2=remainder;
		}
		return num1;
	}
	
	private static boolean isNumPrime(int num) {
		return primes[num];
	}

	private static void fillSieve() {
		Arrays.fill(primes, true);

		primes[0] = primes[1] = false;
		for (int i = 2; i * i < primes.length; i++) {
			if (primes[i]) {
				for (int j = i * 2; j < primes.length; j += i) {
					primes[j] = false;
				}
			}
		}
	}

	@Override
	public void run() {
		fillSieve();
	}
}
