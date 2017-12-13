package com.stackthread.habba;

public class FlattenList {

	public static void main(String[] args) {
		String ip = "[[1], 2, [[3, 4], 5], [[[]]], [[[6]]], 7, 8, []]";
		String op = ip.replace("[", "");
		op = op.replace("]", "");
		String[] reslt = op.split(",");
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < reslt.length; i++) {
			if(reslt[i].trim().isEmpty())
				continue;
			sb.append(reslt[i]);
			sb.append(", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		System.out.println(sb.toString());
	}
}
