package threadsafety;

class Booking {
	static int seatscount = 10;

	synchronized static void bookASeat() {
		System.out.println(seatscount);
		seatscount--;

	}

}

class CThread extends Thread {
	public void run() {
		Booking.bookASeat();

	}
}

public class Test1 {
	public static void main(String[] args) {
		Thread t1 = new CThread();
		Thread t2 = new CThread();
		Thread t3 = new CThread();

		t1.start();
		t2.start();
		t3.start();

	}
}
