package equals;

class emp {
	int id;
	String name;

	emp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public boolean equals(Object o) {
		emp e = (emp) o;
		if (this.id == e.id) {
			return true;

		} else
			return false;

	}

}

public class Test1 {
	public static void main(String[] args) {
		emp e1 = new emp(234, "Syam");
		emp e2 = new emp(456, "Kumar");
		emp e3 = new emp(234, "Diwakar");
		emp e4 = new emp(100, "Paide");
		emp e5 = e1;
		emp e6 = e3;

		System.out.println(e2.equals(e6));
	}
}
