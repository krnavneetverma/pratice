package com.stackthread.lucid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NavisParty {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Map <String,Person> nameMap = new HashMap<String,Person>(n);
		List <String> susList = new ArrayList<String>();
		String name;
		Person person;
		for (int i = 0; i < n; i++) {
			name = sc.nextLine();
			person = nameMap.get(name);
			if(null!=person)
			{
				person.setHeadCount(person.getHeadCount()+1);
				nameMap.put(name, person);
			}
			else
				nameMap.put(name, new Person(name,0,1));
		}
		for (int i = 0; i < n; i++) {
			name = sc.nextLine();
			
			//TODO:
			susList.add(sc.nextLine());
		}
		sc.close();
	}
}


class Person{
	private String name;
	private int age;
	private int headCount;
	
	public Person(String name, int age, int headCount) {
		super();
		this.name = name;
		this.age = age;
		this.headCount = headCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeadCount() {
		return headCount;
	}
	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
}