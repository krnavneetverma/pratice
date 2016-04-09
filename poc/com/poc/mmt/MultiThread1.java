package com.poc.mmt;

public class MultiThread1 {
	public static void main(String[] args) throws InterruptedException {
		TaskRunner tr1 = new TaskRunner();
		TaskRunner tr2 = new TaskRunner();
		tr1.start();
		
		tr2.start();
	}
}

class TaskRunner extends Thread {
	int i = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "-" + i);
		}
	}
}
