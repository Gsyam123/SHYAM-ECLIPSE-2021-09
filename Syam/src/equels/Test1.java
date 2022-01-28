package equels;

class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public boolean equals(Object o1) {
		Emp e = (Emp) o1;
		if (this.id == e.id) {
			return true;

		} else
			return false;

	}
}

public class Test1 {
	public static void main(String[] args) {
		Emp e1 = new Emp(123, "Syam");
		Emp e2 = new Emp(456, "kumar");
		Emp e3 = new Emp(123, "aabc");
		Emp e4 = new Emp(567, "xyz");
		Emp e5 = e4;

		//System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e4.equals(e5));
		System.out.println(e3.equals(e4));
		System.out.println(e5.equals(e4));

	}
}
