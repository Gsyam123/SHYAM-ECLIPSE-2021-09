package inheritance;

class Employee {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;

	}

}

class HR extends Employee {
	int count;

	HR(int id, String name, int count) {
		super(id, name);
		this.count = count;

	}

}
class TEst1{
	public static void main(String []args) {
		HR hr=new HR(50,"syam kumar",500);
		System.out.println(hr.id);
		System.out.println(hr.name);
		System.out.println(hr.count);
		
	}
}