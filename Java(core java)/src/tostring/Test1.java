package tostring;

class Emp {
	int id;
	String name;

	public String toString() {
		return id + name;
	}

}

public class Test1 {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.id = 100;
		e1.name = "Syam";
		Emp e2 = new Emp();
		e2.id = 300;
		e2.name = "Kumar";
		System.out.println(e1);
		System.out.println(e2);

	}
}
