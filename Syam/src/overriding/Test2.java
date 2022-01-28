package overriding;

class S {
	int i = 10;
	static int j = 20;

	public static void m1() {
		System.out.println("A   m1");

	}

	public void m2() {
		System.out.println("A   m2");

	}

}

class K extends S {
	int i = 30;
	static int j = 40;

	public static void m1() {
		System.out.println("B   m1");

	}

	public void m2() {
		System.out.println("B  m2");
	}
}

public class Test2 {
	public static void main(String[] args) {
		S s1 = new S();
		System.out.println(s1.i);
		System.out.println(s1.j);
		s1.m1();
		s1.m2();

		K k1 = new K();
		System.out.println(k1.i);
		System.out.println(k1.j);
		k1.m1();
		k1.m2();

		S s2=new K();
		System.out.println(s2.i);
		System.out.println(s2.j);
		s2.m1();
		s2.m2();
		
	}
}
