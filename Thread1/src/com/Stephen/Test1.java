package com.Stephen;

class MyThread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i:" + i);
			System.out.println("stop wait");
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				System.out.println(e);

			}
		}

	}
}

public class Test1 {
	public static void main(String[] args) {
		Runnable r = new MyThread();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t1.setName("t111");
		t2.start();
		System.out.println("hfhgf");
	}

}
