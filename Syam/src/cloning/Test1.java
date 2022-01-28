package cloning;

class Test1 implements Cloneable {
	int id;
	String name;

	Test1(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public static void main(String[] args) throws Exception {
		Test1 t1 = new Test1(200, "Syam kumar");
		Test1 t2 = (Test1) t1.clone();
		System.out.println(t1.name);
		System.out.println(t1.id);
		t1.id = 900;
		t1.name = "Syam's";
		System.out.println(t1.id);
		System.out.println(t1.name);
	}

}
