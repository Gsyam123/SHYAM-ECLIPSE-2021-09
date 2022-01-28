package collections;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

class Emp1 implements Comparable {
	int id;
	String name;

	Emp1(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return id + "";

	}

	public int compareTo(Object o1) {
		Emp1 e = (Emp1) o1;
		if ((this.id < e.id)) {
			return -1;

		} else if (this.id > e.id) {
			return 1;

		} else {
			return 0;

		}

	}
}

public class Test7 {
	public static void main(String[] args) {
		Emp1 e1 = new Emp1(400, "abc");
		Emp1 e2 = new Emp1(200, "xyz");
		Emp1 e3 = new Emp1(300, "abc");
		Emp1 e4 = new Emp1(300, "xyz");
		Emp1 e5 = e4;

		Set s4 = new TreeSet();
		System.out.println(s4.add(e1));
		System.out.println(s4.add(e2));
		System.out.println(s4.add(e3));
		System.out.println(s4.add(e4));
		System.out.println(s4.add(e5));
		System.out.println(s4);
		
		Set s5=new TreeSet(Collections.reverseOrder());
		System.out.println(s5.add(e1));
		System.out.println(s5.add(e2));
		System.out.println(s5.add(e3));
		System.out.println(s5.add(e4));
		System.out.println(s5.add(e5));
		System.out.println(s5);
	}
}
