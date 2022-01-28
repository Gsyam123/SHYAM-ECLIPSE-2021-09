public class Sample {
	static int i = 10; // static variable
	int j = 10; // non static variable

	static {
		System.out.println("static block");
	}
	{
		System.out.println("non static block");
	}

	Sample() {
		System.out.println("constructor");
	}

	static void m1() {
		System.out.println("static m1 method");
	}

	void m2() {
		System.out.println("non static m2 method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		m1();
		System.out.println(i);
		Sample s1=new Sample();
		s1.m2();

	}
}
