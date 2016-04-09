package com.poc.customAnnotations;

public class CustomAnnotationTester {

	public static void main(String[] args) {
		funnyFunc();
	}
	
	@CustomLogger(logLevel=2)
	public static void funnyFunc()
	{
		System.out.println(" calling funnyFunc ");
	}
}
