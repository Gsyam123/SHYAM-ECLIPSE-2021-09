package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	Set s=new LinkedHashSet();
		s.add("xyz");
		s.add("mno");
		s.add(Integer.valueOf(10));
		s.add(new String("xyz"));
		s.add("mno");
		System.out.println(s);
		
		
		
	
	

}
}