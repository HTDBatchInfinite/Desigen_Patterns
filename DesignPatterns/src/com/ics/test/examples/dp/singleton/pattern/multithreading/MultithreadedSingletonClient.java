package com.ics.test.examples.dp.singleton.pattern.multithreading;

public class MultithreadedSingletonClient implements Runnable {

	public static void main(String[] args) {

		MultithreadedSingletonClient obj1 = new MultithreadedSingletonClient();

		MultithreadedSingletonClient obj2 = new MultithreadedSingletonClient();

		MultithreadedSingletonClient obj3 = new MultithreadedSingletonClient();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);

		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println(
					Thread.currentThread().getName() + " : " + MultithreadedSingleton.getInstance().hashCode());
		}

	}

}
