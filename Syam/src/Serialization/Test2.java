package Serialization;
import java.io.*;

public class Test2 {
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("syam file");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Emp e1=(Emp)ois.readObject();
	System.out.println(e1.id);
	System.out.println(e1.name);
	
			
}
}
