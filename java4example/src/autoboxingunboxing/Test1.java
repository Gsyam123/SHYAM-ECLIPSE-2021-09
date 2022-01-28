package autoboxingunboxing;

public class Test1 {
	public static void main(String[] args) {

		int i = 10;
		// Integer i2=i;
		Integer i3 = new Integer(i);
		Integer i4 = Integer.valueOf(i);
		System.out.println(i3);
		// int i5=i3;
		int i6 = i3.intValue();
		String s1 = "123";
		int i7 = Integer.parseInt(s1);
		System.out.println(i7);
		Integer i8 = Integer.valueOf(s1);
		System.out.println(i8);
	}
}