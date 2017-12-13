package com.stackthread.unknown;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ParanthesisBalance {

	public static void main(String[] args) {
		String str = "()()()((((()))()()()(())()()()))";
		int count = 0;
		char [] chArr = str.toCharArray();
		for (char ch : chArr) {
			if(ch=='(')
				count++;
			if(ch==')')
				count--;
		}
		if(count == 0)
			System.out.println("balanced");
		else
			System.out.println("unbalanced by count "+count);
	}
}
