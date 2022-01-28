package serialization2;

import java.io.*;

class Syam implements Serializable {
	int id;
	String name;
	transient String address;
	String temp;
	static int count;

	Syam(int id, String name, String address, String temp, int count) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.temp = temp;
		this.count = count;

	}

}

public class Test1 {
	public static void main(String[] args) throws Exception {
		Syam s1 = new Syam(150, "syam kumar 123", "Chirala", null, 250);
		File f = new File("Syam file1");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);

		System.out.println(s1.address);

	}
}

