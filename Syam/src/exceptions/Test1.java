package exceptions;

public class Test1 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			int k = i / j;
			System.out.println(k);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("syam");
		int l = 30;
		System.out.println(l);
	}
}
