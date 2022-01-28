package tostring;

class Emp {
	int id;
	String name;
public String toString() {
	return id+name;
	
}
}

public class Test1 {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		Emp e2 = new Emp();

		e1.id = 123;
		e1.name = "Syam";
		e2.id = 567;
		e2.name = "kumar";
System.out.println(e1);
System.out.println(e2);

	}
}
