package collections;

import java.util.HashSet;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("syam");
		s.add(Integer.valueOf(20));
		s.add(new Integer(30));
		s.add("xyz");
		s.add("syam");
		s.add(new String("syam"));
		s.add(Integer.valueOf(20));
		System.out.println(s);
	}
}
