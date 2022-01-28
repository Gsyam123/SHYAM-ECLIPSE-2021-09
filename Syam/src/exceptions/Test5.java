package exceptions;

public class Test5 {
	public int div(int i,int j) {
		int r=i/j;
		return r;
		
	}
	public static void main(String[] args) {
		Test5 t1=new Test5();
		int r1=t1.div(20,5);
		System.out.println(r1);
		try {
		int r2=t1.div(20,0);
		System.out.println(r2);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("syamkumar");
		int r3=t1.div(10,20);
		System.out.println(r3);
	}
}

