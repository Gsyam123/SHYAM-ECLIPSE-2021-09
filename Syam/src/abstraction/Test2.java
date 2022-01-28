package abstraction;

interface I {
	public abstract void m1();

	public static final int i = 10;

}

class K implements I {
	public void m1() {
		System.out.println("Syam");

	}
}

class Factory {
	public static I getA() {
		return new K();

	}
}

public class Test2 {
	public static void main(String[] args) {
		I i = Factory.getA();
		i.m1();

	}
}
