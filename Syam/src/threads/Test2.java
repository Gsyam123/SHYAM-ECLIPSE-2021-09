package threads;

class Syam extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

public class Test2 {
public static void main(String[] args) {
	Thread t1=new Syam();
	Thread t2=new Syam();
	t1.start();
	t2.start();
	System.out.println("syam");
}
}
