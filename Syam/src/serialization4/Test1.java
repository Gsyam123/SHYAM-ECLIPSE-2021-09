package serialization4;

import java.io.*;

public class Test1 {
	public static void main(String[] args) throws Exception {
		Address add = new Address(10, "Clx");
		Emp e1 = new Emp(111, "ABC", add);
		File f = new File("Syam file3");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
	}
}
