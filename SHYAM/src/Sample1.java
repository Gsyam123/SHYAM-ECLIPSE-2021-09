class Sample1 {
	int i = 20;
	static int j = 30;

	public static void main(String[] args) {
		int j = 40; // local variable
		System.out.println(j);
		System.out.println(Sample1.j);
		
		Sample1 s=new Sample1();
		System.out.println(s.i);
		System.out.println(s.j);
		//System.out.println(i);
		
	}
}
