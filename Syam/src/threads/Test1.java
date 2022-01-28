package threads;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.run();
		t2.run();
		System.out.println("end");
	}

}
