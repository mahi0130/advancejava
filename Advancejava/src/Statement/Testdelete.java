package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Testdelete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Statement", "root", "root");
		Statement stmt =conn.createStatement();
		int i=stmt.executeUpdate("delete from work where id = 1");
		System.out.println("done work="+i);
	}

}
