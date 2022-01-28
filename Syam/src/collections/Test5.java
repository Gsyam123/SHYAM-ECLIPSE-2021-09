package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test5 {
public static void main(String[] args) {
	Set s2=new LinkedHashSet();
	s2.add("xyz");
	s2.add("Syam");
	s2.add("mno");
	s2.add("syam");
	s2.add("syam");
	s2.add(new String("xyz"));
	s2.add(Integer.valueOf(10));
	System.out.println(s2);
}
}
