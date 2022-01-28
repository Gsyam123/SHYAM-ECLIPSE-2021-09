package hashset;

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

	public int hashCode() {
		return id;

	}

	public boolean equals(Object o1) {
		Emp e = (Emp) o1;
		/*if (this.id == e.id()) {
			return true;

		}else return false;*/
		return this.id==e.id;
		
	}

}

public class Test2 {
	public static void main(String[] args) {
		Emp e1 = new Emp(101, "xyz");
		Emp e2 = new Emp(102, "abc");
		Emp e3 = new Emp(101, "abc");
		Emp e4 = new Emp(101, "xyz");
		Emp e5 = e1;
		Set s1 = new HashSet();
		System.out.println(s1.add(e1));
		System.out.println(s1.add(e2));
		System.out.println(s1.add(e3));
		System.out.println(s1.add(e4));
		System.out.println(s1.add(e5));
		System.out.println(s1);

	}

}
