package inheritance;

 class C {
	int i = 20;
	static int j = 130;
}

class B extends C{

}

public class A {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);

	}
}