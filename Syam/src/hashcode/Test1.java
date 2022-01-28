package hashcode;

class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}
	public int hashCode() {
		return id;
		
	}
}

public class Test1 {
public static void main(String[] args) {
	Emp e1=new Emp(100,"Syam");
	Emp e2=new Emp(200,"Kumar");
	Emp e3=new Emp(300,"Gsyam");
	System.out.println(e1.hashCode());
	System.out.println(e2.hashCode());
	System.out.println(e3.hashCode());
	System.out.println(e1.hashCode());
	
}
}
