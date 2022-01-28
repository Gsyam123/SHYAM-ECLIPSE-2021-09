package datatypes;

public class PremitiveDatatypes {
	byte b = 5;
	byte b1 = 10;
	// byte b2=200;
	byte b3 = -128;
	byte b4 = 127;
	// byte b5=128;
	int i = 65;
	char c = 65;
	char c1 = 67;

	public static void main(String[] args) {
		PremitiveDatatypes p = new PremitiveDatatypes();

		System.out.println(p.b);
		System.out.println(p.b1);
		System.out.println(p.b3);
		System.out.println(p.b4);
		System.out.println(p.i);
		System.out.println(p.c);
		System.out.println(p.c1);

	}
}
