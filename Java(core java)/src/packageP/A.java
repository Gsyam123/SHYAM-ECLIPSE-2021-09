package packageP;

public class A {
	private static int i = 10;
	static int j = 20;
	protected static int k = 30;
	public static int l = 40;

	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}
}
class B{
	public static void main(String[] args) {
		//System.out.println(A.i);
		System.out.println(A.j);
		System.out.println(A.k);
		System.out.println(A.l);

	}
}