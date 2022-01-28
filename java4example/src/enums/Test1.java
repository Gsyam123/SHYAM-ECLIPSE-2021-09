package enums;

class Colour {
	public static final int RED = 0;
	public static final int ORANGE = 1;
	public static final int GREEN = 2;

}

class Signals {
	public void _3waySignals(int Colour) {
		if (0 == Colour) {
			System.out.println("stop");

		} else if (Colour == 1) {
			System.out.println("wait");
		} else if (Colour == 2) {
			System.out.println("go");

		} else {
			System.out.println("invalid");
		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		Signals s = new Signals();
		s._3waySignals(Colour.RED);
		s._3waySignals(Colour.GREEN);
		s._3waySignals(7);
	}
}
