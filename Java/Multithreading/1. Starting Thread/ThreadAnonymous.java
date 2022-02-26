package com.pratig.StartingThread;

public class ThreadAnonymous {
	public static void main(String args[]) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName());
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		thread.start();
	}
}