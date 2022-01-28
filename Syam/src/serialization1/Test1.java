package serialization1;

import java.io.*;

class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

public class Test1 {
	public static void main(String[] args) throws Exception {
		Emp e1 = new Emp(123, "kumar");
		File f = new File("Syam file2");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

	}
}
