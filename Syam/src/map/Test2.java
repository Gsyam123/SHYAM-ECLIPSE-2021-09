package map;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("xyz");
		l.add("abc");
		l.add("123");
		l.add("abc");
		
		//String s=l.get(0);
		//Object o="xyz";
		String s=(String)l.get(2);
		System.out.println(s);
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		
		
}
}