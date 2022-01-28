package overriding;

class A {
	public void m1() {
		System.out.println("m1    A");

	}

	public static void m2() {
		System.out.println("m2    A");

	}

}

class B extends A {
	public void m1() {
		System.out.println("m1    B");
	}

	public static void m2() {
		System.out.println("m2    B");
	}

}

public class Test1 {
	public static void main(String[] args) {
		A a = new B();
		a.m1();
		a.m2();

	}
}
