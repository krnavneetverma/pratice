package com.am.mission.interview;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MiddleElementInSingleLinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		Node1 start = null,Node1=null,pre=null;
		int vals= sc.nextInt();
		sc.nextLine();
		while(vals-->0)
		{
			Node1 = new Node1(sc.nextInt());

			if(start==null)
			{
				start=Node1;
				pre=Node1;
			}
			else
			{
				pre.next = Node1;
				pre=Node1;
			}
		}
		sc.nextLine();
		sc.close();
		System.out.println(new MiddleElementInSingleLinkedList().getMiddleElement(start));
	}
	
	protected Node1 getMiddleElement(Node1 Node1)
	{
		if(Node1==null)
			return null;
		if(Node1.next==null)
			return Node1;
		
		Node1 slow = Node1,fast=Node1;
	
		while(fast!=null)
		{
			if(fast.next==null)
				break;
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}
}

class Node1
{
	int data;
	Node1 next;
	public Node1(int data)
	{
		this.data=data;
	}
	@Override
	public String toString() {
		return String.valueOf(data);
	}
}