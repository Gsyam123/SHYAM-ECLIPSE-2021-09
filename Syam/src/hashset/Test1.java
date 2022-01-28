package hashset;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {

		Set s = new HashSet();
		s.add("xyz");
		s.add("mno");
		s.add(Integer.valueOf(10));
		s.add(new String("xyz"));
		s.add("xyz");
		System.out.println(s);

	}
}