package in.co.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;

public class Testdesksalary {
	public static void main(String[] args)   throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{CALL deskSalary()}");

callStmt.execute();
   ResultSet rs = callStmt.getResultSet();
  while (rs.next()) {
	  
	  System.out.println(rs.getInt(1));
	
}

		
	}

}
