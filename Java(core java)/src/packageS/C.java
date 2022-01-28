package packageS;

import packageR.*;

public class C {
	public static void main(String[] args) {
		A a = new A();
		// System.out.println(a.i);
		// System.out.println(a.j);
		// System.out.println(a.k);
		System.out.println(a.l);

	}
}

class D extends A {
	public static void main(String[] args) {
		A a = new A();

		//System.out.println(a.i);
		//System.out.println(a.j);
		//System.out.println(a.k);
		System.out.println(a.l);

		D d=new D();
		//System.out.println(d.i);
		//System.out.println(d.j);
		System.out.println(d.k);
		System.out.println(d.l);
		
		
	}
}