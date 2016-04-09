package com.poc.customAnnotations;

import java.lang.reflect.Method;

public class CustomLoggerProcessor{

	
	public static void main(String[] args) {
		Class customClass = null ;
		try {
			customClass = Class.forName(CustomAnnotationTester.class.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			
			Method method = customClass.getMethod("funnyFunc", null);
			
			if(method.isAnnotationPresent(CustomLogger.class))
			{
				CustomLogger cl = method.getAnnotation(CustomLogger.class);
				if(cl.logLevel()==2)
				{
					System.out.println("Entering into method:"+method.getName());
					method.invoke(null, null);
					System.out.println("Exiting from method:"+method.getName());
				}
				else
					method.invoke(null, null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
