package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testselect {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/Statement", "root", "root");
		Statement stmt =conn.createStatement();
		ResultSet rs =stmt.executeQuery("select * from work");
		while (rs.next()) {
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println(rs.getInt(3));
			
		}
	}

}
