package treeset;

import java.util.Set;
import java.util.TreeSet;

class Emp implements Comparable {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return id + "";

	}

	public int compareTo(Object o1) {
		Emp e = (Emp) o1;
		if (this.id < e.id) {
			return -1;

		} else if (this.id > e.id) {
			return 1;

		} else {
			return 0;

		}
	}
}

public class Test2 {
public static void main(String[] args) {
	Emp e1=new Emp(102,"xyz");
	Emp e2=new Emp(101,"mno");
	Emp e3=new Emp(101,"xyz");
	Emp e4=e1;
	
	Set s=new TreeSet();
	System.out.println(s.add(e1));
	System.out.println(s.add(e2));
	System.out.println(s.add(e3));
	System.out.println(s.add(e4));
	System.out.println(s);
	
	
	
	
	
	
}	
}
