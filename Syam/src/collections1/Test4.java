package collections1;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add("xyz");
	l.add("mno");
	l.add("pqr");
	l.add("xyz");
	System.out.println(l.get(1));
	//System.out.println(l.get(5));
	System.out.println(l.contains("pqr"));
	System.out.println(l.contains("xyz"));
	System.out.println(l.contains(new String("mno")));
	System.out.println(l.indexOf("xyz"));
	System.out.println(l.lastIndexOf("xyz"));
	System.out.println(l.indexOf(new String("xyz")));
	System.out.println(l.remove(1));
	System.out.println(l);
	l.remove("xyz");
	System.out.println(l);
}
}
