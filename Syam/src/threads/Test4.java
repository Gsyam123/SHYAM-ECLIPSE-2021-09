package threads;

class Name extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1000);

			} catch (Exception e) {
				System.out.println(e);

			}
			System.out.println(getName() + ":" + i);
		}
	}
}

public class Test4 {
	public static void main(String[] args) {
		Thread t1 = new Name();
		Thread t2 = new Name();
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();

	}
}
