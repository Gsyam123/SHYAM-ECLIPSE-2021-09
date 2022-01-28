package collections;

import java.util.Set;
import java.util.TreeSet;

public class Test6 {
public static void main(String[] args) {
	Set s3=new TreeSet();
	s3.add("syam");
	s3.add("paide");
	s3.add("syam");
	s3.add("diwaker");
	s3.add(new String("paide"));
	//s3.add(10);
	s3.add("paide");
	s3.add("xyz");
	System.out.println(s3);
	
}
}
