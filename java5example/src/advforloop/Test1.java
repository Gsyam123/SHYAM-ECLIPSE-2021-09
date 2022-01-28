package advforloop;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("xyz");
		l.add(Integer.valueOf(10));
		l.add(new String("abc"));
		// System.out.println(l);

		for (Object o1 : l) {
			System.out.println(o1);
		}
	}
}
