package com.stackthread.unknown;

public class StringUrlReplacer {
	
	public static void main(String[] args) {
		String url = "http://www.google.com/hello world\"";
		System.out.println(url);
		System.out.println(url.replace(" ", "%22d").replace("\"", "%5d"));
	}

}
