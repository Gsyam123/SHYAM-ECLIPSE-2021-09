package collections;

import java.util.HashSet;
import java.util.Set;

class Emp3 {
	int id;
	String name;

	Emp3(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return id + "";

	}
	

}

public class Test10 {
	public static void main(String[] args) {
		Set s11 = new HashSet();
		s11.add(new Emp3(101, "syam"));
		s11.add(new Emp3(101, "syam"));
		s11.add(new Emp3(102, "syam"));
		s11.add(new Emp3(100, "syam"));
		System.out.println(s11);

	}
}
