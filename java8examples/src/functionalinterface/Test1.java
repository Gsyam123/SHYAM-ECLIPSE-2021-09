package functionalinterface;

class MyThread implements Runnable {
	public void run() {
		System.out.println("standard athread");
		System.out.println("end");

	}
}

public class Test1 {
public static void main(String[] args) {
	Runnable r=()->{System.out.println("standard athread");
	
	Thread t1=new Thread(r);
	Thread t2=new Thread(r);
	t1.start();
	t2.start();
	}
	
}
}
