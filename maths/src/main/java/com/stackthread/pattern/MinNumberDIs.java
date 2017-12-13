package com.stackthread.pattern;

public class MinNumberDIs {

	public static void main(String[] args) {
		String str = "DDDDD";
		char chArr[]=str.toCharArray();
		
		String pattern = getMinNumber(chArr);
		System.out.println(pattern);
	}

	private static String getMinNumber(char[] chArr) {
		StringBuilder pattern = new StringBuilder();
		int i=0,md=1,cd=1, len = chArr.length;
		
		while(i<len && chArr[i]=='D')
		{	md++;i++;}
		getDPattern(chArr, pattern, cd, md);
		cd=md;
		
		while(i<len && chArr[i]=='I')
		{
			md++;
			if((i+1<len && chArr[i+1]=='I') || i==len-1)
			{
				pattern.append(md);
				i++;
				cd=md;
			}
			else
			{
				while(i+1<len && chArr[i+1]=='D')
				{
					md++;
					i++;
				}
				i++;
				pattern.append(md);
				getDPattern(chArr, pattern, cd, md-1);
				cd=md;
			}
			
		}
		return pattern.toString();
	}

	private static void getDPattern(char[] chArr, StringBuilder pattern, int cd, int md) {
		
		boolean flag = false;
		
		if(pattern.length()==0)
			flag = true;
		
		for (int i = md; i > cd; i--) {
			pattern.append(i);
		}
		
		if(flag)
			pattern.append(1);
		
	}



}
