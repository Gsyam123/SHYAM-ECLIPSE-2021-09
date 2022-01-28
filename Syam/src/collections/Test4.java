package collections;

import java.util.HashSet;
import java.util.Set;

class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return id + "";
	}
	@Override
	public int hashCode() {
		return id;

	}

	public boolean equals(Object o) {
		Emp e = (Emp) o;
		if (this.id == e.id) {
			return true;

		} else
			return false;

	}
}

public class Test4 {
	public static void main(String[] args) {
		Emp e1 = new Emp(100, "syam");
		Emp e2 = new Emp(200, "kumar");
		Emp e3 = new Emp(100, "syamkumar");
		Emp e4 = new Emp(400, "kumar syam");
		Emp e5 = e4;
		Emp e6 = new Emp(400, "(Kumar syam)");

		Set s1 = new HashSet();
		System.out.println(s1.add(e1));
		System.out.println(s1.add(e2));
		System.out.println(s1.add(e3));
		System.out.println(s1.add(e4));
		System.out.println(s1.add(e5));
		System.out.println(s1.add(e6));

		System.out.println(s1);

	}
}
