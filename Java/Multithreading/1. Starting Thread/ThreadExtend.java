package com.pratig.StartingThread;

class Extender extends Thread{
	@Override
	public void run() {
		System.out.println("Name of the Thread: "+ Thread.currentThread().getName());
		System.out.println("Id of the Thread: "+ Thread.currentThread().getId());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadExtend {

	public static void main(String[] args) {
		Extender thread1 = new Extender();
		thread1.setName("Thread1");
		thread1.start();
		thread1 = new Extender();
		thread1.setName("Thread2");
		thread1.start();
	}

}
