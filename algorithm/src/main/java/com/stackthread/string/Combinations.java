package com.stackthread.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Combinations {

	public static void main(String[] args) {
		String str = "ABC";
		// count of unique character,store it in an char array
		char[] uniqueCharArr = getUniqCharArr(str);
		//create character count map
		Map<Character, Integer> charCountMap = getCharCountMap(str);
		// create output array

		// printCombinationRecursively()
	}

	private static Map<Character, Integer> getCharCountMap(String str) {
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		int literalCount = 0;
		char[] raw = str.toUpperCase().toCharArray();
		for (char ch : raw) {
			if (((1 << (ch - 65)) & literalCount) == 0) {
				charCountMap.put(ch, 1);
				literalCount |= 1 << (ch - 65);
			} else {
				charCountMap.put(ch, charCountMap.get(ch) + 1);
			}
		}
		return charCountMap;
	}

	private static char[] getUniqCharArr(String str) {
		int literalCount = 0, uniqCount = 0;
		char[] raw = str.toUpperCase().toCharArray();
		for (char ch : raw) {
			if (((1 << (ch - 65)) & literalCount) == 0) {
				literalCount |= 1 << (ch - 65);
				uniqCount++;
			}
		}
		char[] chArr = new char[uniqCount];
		int idx = 0, litIdx = 0;
		while (literalCount > 0) {
			if ((1 & (1 >> literalCount)) == 1)
				chArr[idx++] = (char) (litIdx + 65);
			literalCount = 1 >> literalCount;
			litIdx++;
		}
		return chArr;
	}
}

class CharCountPair<K, V> {
	public final char ch;
	public final int count;

	public CharCountPair(char ch, int count) {
		this.ch = ch;
		this.count = count;
	}

	public boolean equals(Object o) {
		return o instanceof CharCountPair && Objects.equals(ch, ((CharCountPair<?, ?>) o).ch)
				&& Objects.equals(count, ((CharCountPair<?, ?>) o).count);
	}

	public int hashCode() {
		return 31 * Objects.hashCode(ch) + Objects.hashCode(count);
	}

	public String toString() {
		return ch + "=" + count;
	}
}
