package abstraction;

interface I1 {
	void m1();

}

interface I2 {
	void m1();

}

class A implements I1, I2 {
	public void m1() {
		System.out.println("987");

	}
}

public class Test3 {
	public static void main(String[] args) {
		I1 i = new A();
		i.m1();
		I2 i1 = new A();
		i1.m1();
		A a = new A();
		a.m1();

	}
}
