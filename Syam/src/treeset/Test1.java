package treeset;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
	public static void main(String[] args) {
		Set s = new TreeSet();
		s.add("xyz");
		s.add("pqr");
		s.add("xyz");
		s.add("abc");
		s.add("mno");
		s.add(new String("xyz"));
		System.out.println(s);
		

	}

}
