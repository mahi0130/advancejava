package in.co.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ShortprocedureIn {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{CALL deskIN(?)}");

		callStmt.setInt(1, 2);
		

		callStmt.execute();

		ResultSet rs = callStmt.getResultSet();

		while (rs.next()) {

			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		 
	    	  
	      }
	       
		
	}

}
