package com.stackthread.onMobile;

public class MergeString {

    static String mergeStrings(String a, String b) {
    	StringBuffer sb = new StringBuffer("");
    	int alen = a.length()-1;
    	int blen = b.length()-1;
    	char aChar[] = a.toCharArray();
    	char bChar[] = b.toCharArray();
    	int i = 0;
    	while(i<=alen && i<=blen)
    	{
    		sb.append(aChar[i]);
    		sb.append(bChar[i]);
    		i++;
    	}
    	while(alen>=i)
    	{
    		sb.append(aChar[alen]);
    		i++;
    	}
    	while(blen>=i)
    	{
    		sb.append(bChar[i]);
    		i++;
    	}

    	return sb.toString();
    }
    public static void main(String[] args) {
    	String a = "abc";
    	String b = "defgh";
    	System.out.println(mergeStrings(a,b));
	}
}
