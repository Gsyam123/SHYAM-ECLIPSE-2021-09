
public class Datatypes {
	byte b = 5;
	byte b1 = 10;
//byte b2=200; compile time error
	byte b3 = -128;
	byte b4 = 127;
//byte b5=128;
	byte b6 = -12;
	int i = 65;
	char c = 66;

	public static void main(String[] args) {
		Datatypes d1 = new Datatypes();
		System.out.println(d1.b3);
		System.out.println(d1.c);
	}

}

class Datatypes1 {
	byte b1 = 10;
	byte b2 = 20;
	byte b5 = -123;
	int i2 = b5;// implicit type casting
	// byte b6=i2;

	byte b7 = (byte) i2;// Explicit type casting

	public static void main(String[] args) {
		Datatypes1 d1 = new Datatypes1();
		System.out.println(d1.b7);

	}

}

class Datatypes2 {
	int i = -129;
	byte b = (byte) i;

	public static void main(String[] args) {
		Datatypes2 d1 = new Datatypes2();
		System.out.println(d1.b);

	}
}

class Datatypes3 {
	byte b1 = 10;
	short s1 = 10;
//	short s2=s1+b1; (int)
	short s2 = (short) (s1 + b1);
	float f = 10;
	// float f1=10.5;
	float f3 = (float) 10.5;
	float f4 = 10.5F;
	// int i=s1+f4;
	float f5 = s1 + f4;
	int i2 = (int) (s1 + f4);

	public static void main(String[] args) {
		Datatypes3 d1 = new Datatypes3();
		System.out.println(d1.s2);
		System.out.println(d1.f5);
		System.out.println(d1.i2);

	}

}

class Datatypes4 {
	byte b1 = 10;
	int i = b1;
	// byte b2=i;
	byte b3 = (byte) i;
	byte b4 = 10;
	byte b5 = 20;
	// byte b6=b4+b5;
	byte b7 = (byte) (b4 + b5);

	public static void main(String[] args) {
		Datatypes4 d = new Datatypes4();

		System.out.println(d.b3);
		System.out.println(d.b7);

	}

}

