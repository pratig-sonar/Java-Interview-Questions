package com.pratig.StartingThread;

class Runner implements Runnable{
	/**
	 *
	 */
	@Override
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		System.out.println("Id: " + Thread.currentThread().getId());
		Thread.currentThread().setName("New name");
		for (int i = 0; i < 5; i++) {
			System.out.println(" i: "+ i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadRunnable{

	public static void main(String[] args) {
//		Runner runner1 = new Runner();
//		Runner runner2 = new Runner();
//		runner1.run();
//		runner2.run();
		Thread thread1 = new Thread(new Runner());
		Thread thread2 = new Thread(new Runner());
		thread1.setName("Thread1");
		thread2.setName("Thread2");
		thread1.start();
		thread2.start();
	}

}
