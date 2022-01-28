package variables;

public class Sample {
int i=10;
static int j=20;
public static void main(String[] args) {
	int j=30;
	System.out.println(j);
	System.out.println(Sample.j);
	Sample s1=new Sample();
	System.out.println(s1.i);
	System.out.println(j);
	System.out.println(j);
	
}
}
