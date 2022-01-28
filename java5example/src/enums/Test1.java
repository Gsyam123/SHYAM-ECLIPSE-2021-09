package enums;

enum Colour {
	RED, ORANGE, GREEN
};

class Signals {
	public void _3waySignals(Colour c) {
		if (c.ordinal() == 0) {
			System.out.println("stop");

		} else if (c.ordinal() == 1) {
			System.out.println("wait");

		} else {
			System.out.println("go");

		}
	}
}

public class Test1 {
	public static void main(String[] args) {
		Signals s = new Signals();
		s._3waySignals(Colour.RED);
		s._3waySignals(Colour.GREEN);
		//s._3waySignals(Colour.PINK);
		
	}
}
