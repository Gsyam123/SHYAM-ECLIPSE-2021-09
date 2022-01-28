package exceptions;

public class Test2 {
	public static void m1() throws Exception {
		System.out.println("syamkumar");

	}

	public static void main(String[] args) {
		try {
			Test2.m1();
		} catch (Exception e) {
			System.out.println(e);

		}
		System.out.println("abcde");

	}
}
