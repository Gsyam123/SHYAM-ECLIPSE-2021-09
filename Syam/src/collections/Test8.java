package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Emp2 {
	int id;
	String name;

	Emp2(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return id + "";

	}
}

class Kumar implements Comparator {
	public int compare(Object o1, Object o2) {
		Emp2 e1 = (Emp2) o1;
		Emp2 e2 = (Emp2) o2;
		if (e1.id < e2.id) {
			return -1;

		} else if (e1.id > e2.id) {
			return 1;

		} else
			return 0;

	}
}

public class Test8 {
	public static void main(String[] args) {
		Emp2 e1 = new Emp2(200, "Syam");
		Emp2 e2 = new Emp2(100, "kumar");
		Emp2 e3 = new Emp2(300, "Syam");
		Emp2 e4 = e2;
		/*
		 * Set s6=new TreeSet(); System.out.println(s6.add(e1));
		 * System.out.println(s6.add(e2));
		 */
		Set s7 = new TreeSet(new Kumar());
		System.out.println(s7.add(e1));
		System.out.println(s7.add(e2));
		System.out.println(s7.add(e3));
		System.out.println(s7.add(e4));
		System.out.println(s7);
		Set s8 = new TreeSet(Collections.reverseOrder(new Kumar()));
		System.out.println(s8.add(e1));
		System.out.println(s8.add(e2));
		System.out.println(s8.add(e3));
		System.out.println(s8.add(e4));
		System.out.println(s8);
	}
}
