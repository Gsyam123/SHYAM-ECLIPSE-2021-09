package abstraction;

abstract class Syam {
	abstract void java();

}

class Kumar extends Syam {
	void java() {
		System.out.println("Software Engineer");

	}
}

class Industry {
	public static Syam getA() {
		return new Kumar();

	}
}

public class Test1 {
	public static void main(String[] args) {

		Syam S1 = Industry.getA();
		S1.java();

	}
}
