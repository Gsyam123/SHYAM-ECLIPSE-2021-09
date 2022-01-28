package cloning;

import java.io.*;

class Emp implements Cloneable {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}

public class Test2 {
	public static void main(String[] args) throws Exception {
		Emp e1 = new Emp(150, "Kumar");
		Emp e2 = (Emp) e1.clone();
		System.out.println(e1.id);
		System.out.println(e2.id);
		System.out.println(e1.name);
		System.out.println(e2.name);
		e2.id = 300;
		e1.id = 400;
		System.out.println(e1.id);
		System.out.println(e2.id);

	}

}
