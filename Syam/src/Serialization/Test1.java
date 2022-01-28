package Serialization;
import java.io.*;

class Emp implements Serializable {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}
}

public class Test1 {
	public static void main(String[] args) throws Exception {
		Emp e1 = new Emp(100, "syam");
		File f = new File("syam file");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
       
	}
}
