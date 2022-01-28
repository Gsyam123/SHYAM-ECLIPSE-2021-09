package com.syam.dov.banktest.server.one;

class Emp1 {
	int id;
	String name;
	String gen;
	String ph;

	Emp1(int id, String name, String gen, String ph) {
		this.id = id;
		this.name = name;
		this.gen = gen;
		this.ph = ph;

	}

}

public class Test2 {
	public static void main(String[] args) {
		Emp1 e1 = new Emp1(456, "Syam", "Male", "9502440480");
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.gen);
		System.out.println(e1.ph);

	}
}
