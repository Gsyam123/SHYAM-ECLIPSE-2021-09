
public class Sample1 {
	static int i = 10; // static variable
	int j = 20;// non-static variable

	static {
		System.out.println("static block");

	}

	{
		System.out.println("non-static block");

	}

	static void m1() {
		System.out.println("static method");

	}

	void m2() {
		System.out.println("non-static method");
	}

	Sample1() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		Sample1 s1 = new Sample1();
		System.out.println(s1.j);
		System.out.println(i);

	}

}
