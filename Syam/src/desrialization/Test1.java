package desrialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import serialization4.Emp;

public class Test1 {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("Syam file3");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e1 = (Emp) ois.readObject();
		System.out.println(e1.id);
		System.out.println(e1.name);
	}
}