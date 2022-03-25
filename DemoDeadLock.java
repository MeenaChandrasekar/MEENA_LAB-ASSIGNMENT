


package com.session1.threads_basics;

public class DemoDeadLock {

	public static void main(String[] args) {
		// try to simulate deadlock
		final Object r1 = "bat";
		final Object r2 = "ball";

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("t1 get lock on r1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (r2) {
						System.out.println("t1 get lock on r2");

					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (r2) {
					System.out.println("t2 get lock on r2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (r1) {
						System.out.println("t2 get lock on r1");

					}
				}
			}
		});

		t1.start();
		t2.start();
	}

}
