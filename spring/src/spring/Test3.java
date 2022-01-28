package spring;

interface I {
	public void m1();

}

class A implements I {
	public void m1() {
		System.out.println("m1..A");
	}

	class B implements I {
		public void m1() {
			System.out.println("m1..B");

		}
	}

	class C extends A {
		public void m1() {
			System.out.println("c..m1");
		}
	}
}

class Factory{
	public static I getI() {
		return new A();
		
	}
}
public class Test3 {
	public static void main(String[] args) {
		I i1=Factory.getI();
		i1.m1();
		

	}
}
