package p;

public class A {
	private int i = 10;
	int j = 20;
	protected int k = 30;
	public int l = 40;
	public static void main(String[]args) {
		A a1=new A();
		System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
		System.out.println(a1.l);
		
	}
}

class B {
	public static void main(String[] args) {
		A a1 = new A();
		// System.out.println(a1.i);
		System.out.println(a1.j);
		System.out.println(a1.k);
		System.out.println(a1.l);

	}
}

