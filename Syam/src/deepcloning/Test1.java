package deepcloning;

class Address implements Cloneable {
	int sno;
	String sname;

	Address(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

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
		Emp e=(Emp)super.clone();
		e.add=(Address)e.add.clone();
		return e;
		
		
	}

	public class Test1 {
		public static void main(String[] args) throws Exception {
			Address add = new Address(15, "syamu");
			Emp e1 = new Emp(16, "diva", add);
			Emp e2 = (Emp) e1.clone();
			System.out.println(e1.id);
			System.out.println(e2.id);
			System.out.println(e1.add.sname);
			System.out.println(e2.add.sno);
			e1.id=17;
			e2.name="paide";
			System.out.println(e1.id);
			System.out.println(e2.name);
			e2.add.sno=5;
			e1.add.sname="shyamkumar";
			System.out.println(e2.add.sno);
			System.out.println(e1.add.sname);
		}
	}

}
