package com.stackthread.string;

import java.util.Scanner;

public class PanGram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String line  = sc.nextLine();
		int bucket[] = new int[26];
		boolean flag = true;
		
		for(int i = 0; i<26; i++)
		{
			bucket[i]=0;
		}
		
		for(char ch : line.toCharArray())
		{
			if(ch>96 && ch<124) 
				bucket[ch-97] +=1;
			if(ch>64 && ch<92)
				bucket[ch-65] +=1;
		}
		
		for(int i = 0; i<26; i++)
		{
			
			if(bucket[i]==0)
			{
				flag=false;
				break;
			}
		}

		System.out.println(flag?"pangram":"not pangram");
		sc.close();
	}
}
