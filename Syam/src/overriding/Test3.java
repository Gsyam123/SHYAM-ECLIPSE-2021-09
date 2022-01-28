package overriding;

class AB {
	private void m1() {
		System.out.println("A   m1");

	}
}

class BA extends AB {
	public void m1() {
		System.out.println("B   m1");

	}
}

public class Test3 {
public static void main(String[] args) {
	AB a1=new BA();
//	a1.m1();   private methods can not be overridden
	
	
}
}
