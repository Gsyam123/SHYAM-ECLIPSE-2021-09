package enums;

enum Fruit {
	APPLE(20), ORANGE(10), MANGO(5), BANANA(5);

	int value;

	Fruit(int value) {
		this.value = value;

	}

	public int getvalue() {
		return this.value;

	}
}

public class Test2 {
	public static void main(String[] args) {
		//System.out.println(Fruit.APPLE);
		//System.out.println(Fruit.BANANA.ordinal());
		//System.out.println(Fruit.MANGO.ordinal());
		//System.out.println(Fruit.ORANGE.getvalue());
		Fruit f = Fruit.MANGO;
		Fruit[] arr = new Fruit[5];
		Fruit[] arr2 = { Fruit.APPLE, Fruit.MANGO };
		int totalcost = 0;
		for (Fruit fr : arr2) {
			totalcost += fr.getvalue();

		}
		Fruit f2=Fruit.valueOf("APPLE");
		System.out.println(f2);

	}
}
