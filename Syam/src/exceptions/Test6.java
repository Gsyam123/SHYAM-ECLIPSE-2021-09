package exceptions;

public class Test6 {
public static void main(String[] args) {
	int i=10;
	int j=0;
	try {
	int k=i/j;
	System.out.println(k);
	}catch (Exception e) {
		System.out.println(e);
	}
	int a=10;
	byte b=5;
	int x=a/b;
	System.out.println(x);
	
}
}
