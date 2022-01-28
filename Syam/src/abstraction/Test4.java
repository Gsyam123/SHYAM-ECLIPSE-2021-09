package abstraction;
interface I3{
	void m1();
	
}
interface I4{
	void m2();
	
}
class B implements I3,I4{
	public void m1() {
		System.out.println("syam");
		
	}
	public void m2() {
		System.out.println("kumar");
		
	}
}
public class Test4 {
	public static void main(String[] args) {
		
		I3 i1=new B();
		i1.m1();
		//i1.m2();
		
		
	}

}
