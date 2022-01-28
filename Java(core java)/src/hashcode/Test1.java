package hashcode;

class Emp {
	int id;
	String name;
	String phno;

	Emp(int id, String name, String phno) {
		this.id = id;
		this.name = name;
		this.phno = phno;

	}

	public int hashCode() {
		return id;

	}

}

public class Test1 {
	public static void main(String[] args) {
		Emp e1 = new Emp(123, "Syam", "9502440480");
		Emp e2 = new Emp(234, "Kumar", "3344475893");

		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
