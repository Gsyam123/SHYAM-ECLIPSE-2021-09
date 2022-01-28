package packageR;

public class A {
	private int i = 10;
	int j = 20;
	protected int k = 30;
	public int l = 40;

	public static void main(String[] args) {
		A a = new A();

		System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		System.out.println(a.l);

	}

}

class B {
	public static void main(String[] args) {
		A a = new A();

		// System.out.println(a.i);
		System.out.println(a.j);
		System.out.println(a.k);
		System.out.println(a.l);

	}
}