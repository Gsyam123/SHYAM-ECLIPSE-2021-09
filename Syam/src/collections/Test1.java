package collections;

import java.util.ArrayList;
import java.util.List;

public class Test1 {     //Array List
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("syam");
		l.add(new Integer(20));
		l.add(1,Integer.valueOf(30));
		l.add("xyz");
		l.add(new String("abcd"));
		l.add(4,"xyz");
		l.add(2, "abcd");

		System.out.println(l);
	}
}
