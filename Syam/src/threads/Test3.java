package threads;

class Kumar extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + ":" + i);

		}
	}
}

public class Test3 {
	public static void main(String[] args) {
		Thread t1=new Kumar();
		Thread t2=new Kumar();
		t1.setName("T1");
		t2.setName("T2");
		t1.start();
		t2.start();
		
	}
}
