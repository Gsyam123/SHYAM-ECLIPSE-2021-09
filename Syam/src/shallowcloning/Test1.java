package shallowcloning;

class Address {
	int sno;
	String sname;

	Address(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;

	}
}

class Emp implements Cloneable {
	int id;
	String name;
	Address add;

	Emp(int id, String name, Address add) {
		this.id = id;
		this.name = name;
		this.add = add;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}

}

class Test1 {
	public static void main(String[] args) throws Exception {
		Address add = new Address(12, "Chirala");
		Emp e1 = new Emp(120, "Syam's", add);
		Emp e2 = (Emp) e1.clone();
		System.out.println(e1.id);
		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e1.add.sname);
		System.out.println(e1.add.sno);
		e1.add.sno=18;
		System.out.println(e1.add.sno);

	}
}
