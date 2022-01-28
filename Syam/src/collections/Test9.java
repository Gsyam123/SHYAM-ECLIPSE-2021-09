package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test9 {
	public static void main(String[] args) {

		Set s9 = new HashSet();
		s9.add("mno");
		s9.add("xyz");
		s9.add("abc");
		s9.add("xyz");
		System.out.println(s9);
		Set s10=new TreeSet(s9);
		System.out.println(s10);
		
	}
}