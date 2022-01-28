package staticanddefault;

interface I1 {
	default void m1() {
		System.out.println("m1..I1");
	}

	default void m2() {
		System.out.println("m1...I2");

	}
	class C {
		public void m1() {
			System.out.println("m1..C");
			
		}
		
	}
}

public class Test1 {
public static void main(String[] args) {
		//I1 i1=new C();
	
}
}
