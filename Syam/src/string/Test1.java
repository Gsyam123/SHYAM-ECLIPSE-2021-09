package string;

public class Test1 {
	public static void main(String[] args) {
		String s1 = "xyz";
		String s2 = new String("abc");
		String s3 = new String("mno");
		String s4 = new String("mno");
		String s5 = new String("def");
		String s6 = "def";
		String s7 = new String("pqr");
		String s8 = s7.intern();
		String s9 = "A";
		String s10 = "pqr";

		/*System.out.println(s9.hashCode());
		System.out.println(s7.equals(s8));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));*/
		System.out.println(s9.toLowerCase());
		String S1="welcome";
		System.out.println(S1.toUpperCase());
		System.out.println(S1);
		String S2=S1.substring(4);
		System.out.println(S2);
		char c=S1.charAt(5);
		System.out.println(c);
		System.out.println(S1.length());
		char[] arr=S1.toCharArray();
		System.out.println(arr);
		
		
		
		
		
	}
}
