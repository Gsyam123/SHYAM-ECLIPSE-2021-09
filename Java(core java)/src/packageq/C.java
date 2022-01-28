package packageq;

import packageP.*;

public class C {
	public static void main(String[] args) {

		// System.out.println(A.i);
		// System.out.println(A.j);
		// System.out.println(A.k);
		System.out.println(A.l);
	}
}

class D extends A {
	public static void main(String[] args) {

	//	System.out.println(A.i);
	//	System.out.println(A.j);
		System.out.println(A.k);
		System.out.println(A.l);
		System.out.println(D.k);
		System.out.println(D.l);
		
	}
}