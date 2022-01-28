package inheritance;

class S {
	int i = 10;
	static int j = 20;

}

class K extends S {
	int k = 30;
	static int l = 40;

}

public class test {
	public static void main(String args[]) {
		// System.out.println(A.i);
		// System.out.println(A.l);
		System.out.println(S.j);
		System.out.println(K.j);
		// System.out.println(K.i);
		// System.out.println(K.k);
		System.out.println(K.l);
		S s1 = new S();
		System.out.println(s1.i);
		System.out.println(s1.j);
		// System.out.println(s1.k);
		// System.out.println(s1.l);
		K k1 = new K();
		System.out.println(k1.k);
		System.out.println(k1.l);
		System.out.println(k1.i);
		System.out.println(k1.j);
		S s2 = new K();
		System.out.println(s2.i);
		System.out.println(s2.j);
		// System.out.println(s2.k);
		// System.out.println(s2.l);
		// K k2=new S();

	}
}
