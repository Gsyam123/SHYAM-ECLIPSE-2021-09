package collections;

import java.util.LinkedList;
import java.util.List;

public class Test2 {
public static void main(String[] args) {
	List l=new LinkedList();       //Linked list
	l.add("xyz");
	l.add("pqr");
	l.add("mno");
	l.add(0,"syam");
	System.out.println(l.get(1));
	l.add(1,"kumar");
	System.out.println(l);
	
}
}
