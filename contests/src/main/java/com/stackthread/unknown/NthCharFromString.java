package com.stackthread.unknown;

import java.util.Scanner;

public class NthCharFromString {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		String line = sc.nextLine();
		StringBuilder lineBldr = new StringBuilder(line);
		expandString(lineBldr);
		System.out.println(lineBldr);
		sc.close();
	}

	private static StringBuilder expandString(StringBuilder line) {
		StringBuilder expansion;
		String expStr[] = line.toString().split("[0-9]");
		if(expStr.length==1 && expStr[0].length() == line.length())
			return line;
		else
		{
			expansion = new StringBuilder(line.toString().split("[0-9]")[0]);
			
			int numIdx1 = Integer.parseInt(String.valueOf(line.charAt(expansion.length())))
					,idx = 1 ;
			while(numIdx1>idx)
			{
				expansion.append(expansion);
				idx++;
			}
			if(expStr.length!=1)
			{
				line.delete(0, numIdx1);
				line.insert(0, expansion);
			}
			else
			{
				line = expansion;
			}
		}
		return expandString(line);
		
	}
}
