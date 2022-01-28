package collections1;

import java.util.HashSet;
import java.util.Set;

public class Test5 {
	public static void main(String[] args) {

		Set s = new HashSet();
		s.add("xyz");
		s.add("mno");
		s.add("pqr");
		s.add("xyz");
		System.out.println(s);
		//System.out.println(s.get(0));
		System.out.println(s.contains("mno"));
		System.out.println(s.contains("xyz"));
		s.remove("xyz");
		System.out.println(s);
		
	}
}