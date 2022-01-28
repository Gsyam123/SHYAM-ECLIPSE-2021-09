package scanner;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter no1 :");
	int no1=Integer.parseInt(s.nextLine());
	System.out.println("enter no2 :");
	int no2=Integer.parseInt(s.nextLine());
	System.out.println("result :"+(no1-no2));
}
}
