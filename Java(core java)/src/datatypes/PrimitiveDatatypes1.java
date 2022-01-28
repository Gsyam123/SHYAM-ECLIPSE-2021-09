package datatypes;

public class PrimitiveDatatypes1 {
	/*
	 * byte b1 = 10; byte b2 = 20; //byte b3=b1+b2; byte b5=10; int i=b5;// implecit
	 * casting //byte b6=i; byte b7=(byte)i; //explicit casting int i2=200; byte
	 * b8=(byte)i2;
	 * 
	 * int i3=128; byte b9=(byte)i3;
	 * 
	 * int i4=-129; byte b10=(byte)i4;
	 */

	byte b1 = 10;
	short s1 = 10;
	short s2 = (short) (s1 + b1);
	int i = s1 + b1;
	float f = 15;
//float f1=15.5;
	float f1 = 15.5f;
	float f2 = (float) 10.3;
	int i1 = (int) (s1 + f1);
	float f3=s1+f1;
	int i2=(int)(s1+f1);
	
	

	public static void main(String[] args) {
		PrimitiveDatatypes1 p1 = new PrimitiveDatatypes1();

		/*
		 * System.out.println(p1.b7); System.out.println(p1.i);
		 * System.out.println(p1.b5); System.out.println(p1.i2);
		 * System.out.println(p1.b9); System.out.println(p1.b10);
		 
		System.out.println(p1.s2);
		System.out.println(p1.i);*/
		System.out.println(p1.i1);
		System.out.println(p1.f2);
		System.out.println(p1.f3);
		System.out.println(p1.i2);



		
		
		
	}

}
