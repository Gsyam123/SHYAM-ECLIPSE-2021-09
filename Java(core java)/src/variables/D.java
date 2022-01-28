package variables;

public class D {
	static boolean flag = true;

	static void m1() {
		System.out.println("Syamkumar");

	}

	public static void main(String[] args) {
		System.out.println(flag);
		m1();
		System.out.println(D.flag);
		D.m1();
		

	}
}
