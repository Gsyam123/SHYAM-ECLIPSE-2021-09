package datahiding;

public class Emp {
	private int id;
	private String name;

	public void setId(int id) {
		this.id = id;

	}

	public int getId() {
		return this.id;

	}

}
class Test{
	public static void main(String[] args) {
		Emp e=new Emp();
		e.setId(100);
		e.setId(200);
		e.setId(223);
		
	}
}