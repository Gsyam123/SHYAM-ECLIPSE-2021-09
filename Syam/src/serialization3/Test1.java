package serialization3;

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

		FileInputStream fis = new FileInputStream("Syam file1");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Syam s1 = (Syam) ois.readObject();
		System.out.println(s1.id);
		
	}

}
