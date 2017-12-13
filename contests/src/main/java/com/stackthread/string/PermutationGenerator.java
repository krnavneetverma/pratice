package com.stackthread.string;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PermutationGenerator {

	public static void main(String[] args) {
		String str = "AABCD";
		int count[] = getCharCountArray(str);
		Set<String> resltSet = new LinkedHashSet<String>();
		char resltArr[] = new char[str.length()];
		permute(str.toCharArray(),count,0,resltArr, resltSet);
		
	}

	private static void permute(char[] charArray, int[] count, int i, char[] resltArr, Set<String> resltSet) {
		// TODO Auto-generated method stub
		
	}

	private static int[] getCharCountArray(String str) {
		int count[] = null;
		Map<Character, Integer> countMap = new TreeMap<Character, Integer>();
		for(char ch: str.toCharArray())
		{
			countMap.compute(ch, (key,val)->{
				if(val==null)
					return 1;
				else
					return val = 1;
				});
		}
		count = new int[countMap.size()];
		for (int i = 0; i < countMap.size(); i++) {
			//count[i]=countMap.get(key)
		}
		return count;
	}
}
