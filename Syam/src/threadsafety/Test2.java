package threadsafety;

class A {
	static int no = 10;

	static void increment() {
		System.out.println(no ++);
	}
}

class T extends Thread {
	public void run() {
		for (int i =0; i < 20; i++) {
			A.increment();
		}
	}

}

public class Test2 {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		t1.start();
		t2.start();
		t3.start();

	}
}
