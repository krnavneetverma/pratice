package com.am.mission.interview;

public class ImplementQueueUsingLinkedList {

	/* The method push to push element into the queue */

}



// and the structure of the class is
class CustomQueue {
	
	private QueueNode front;
	private QueueNode rear;
	
	// The structure of the node of the queue is
	class QueueNode {
		int data;
		QueueNode next;
	}
	
	void push(int a) {
		// Your code
		QueueNode node = new QueueNode();
		node.data = a;
		node.next = null;
		rear.next=node;
		rear=node;		
	}

	/* The method pop which return the element poped out of the queue */
	int pop() {
		int data = front.data;
		front = front.next;
		return data;
	}
}