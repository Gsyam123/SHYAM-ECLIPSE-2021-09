package com.syam.dov.banktest.server.one;

class Emp {
	int id;
	String name;
	String address;

}

public class Test1 {
	public static void main(String[] args) {

		Emp e1 = new Emp();
		e1.id = 123;
		e1.name = "syam";
		e1.address = "Vetapalem";

		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.address);
		
	}
}