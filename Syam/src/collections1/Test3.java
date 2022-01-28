package collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("xyz");
		l.add("abc");
		l.add("mno");
		l.add("abc");
		System.out.println(l);
		/*
		 * Collections.sort(l); System.out.println(l); Collections.reverse(l);
		 * System.out.println(l);
		 */
		Collections.sort(l, Collections.reverseOrder());
		System.out.println(l);
	}
}
