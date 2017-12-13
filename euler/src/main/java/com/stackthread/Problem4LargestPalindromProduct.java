/**
A palindromic number reads the same both ways. The smallest 6 digit palindrome made from the product of two 3-digit numbers is 101101=143*707. 

Find the largest palindrome made from the product of two 3-digit numbers which is less than N.

Input Format 
First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

Output Format 
Print the required answer for each test case in a new line.

Constraints 
1<=T<=100 
101101<N<1000000

Sample Input
2
101110
800000
Sample Output
101101
793397
 * 
 */

package com.stackthread;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem4LargestPalindromProduct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		int nTestCases = 0;// num = 0;
		nTestCases = Integer.parseInt(sc.nextLine());
		String numStr = "";
		for (int i = 0; i < nTestCases; i++) {
			
			numStr = sc.nextLine();
			list.add(findPanlindromeLesserThan(numStr));
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
	}

	private static String findPanlindromeLesserThan(String numStr) {
		//numStr.substring(numStr.length()/2-1);
		StringBuffer halfStr = new StringBuffer(numStr.substring(0,3));
		String palindrome  = "";
		boolean isFound = false;
		do
		{
			palindrome = halfStr.append(halfStr.reverse()).toString();
		}while(!isFound);
		
		return palindrome;
	}
}
