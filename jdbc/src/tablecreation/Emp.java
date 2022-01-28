package tablecreation;

import java.sql.Connection;
import java.sql.Statement;

public class Emp {
	public static void main(String[] args) throws Exception {
		Connection con=Test1.getConnection();
		Statement stunt = con.createStatement();
		String insertquery = "update Gsyam set sal=700000 where id=567";

		int no = stunt.executeUpdate(insertquery);
		System.out.println(no + "records inserted");
	}
}
