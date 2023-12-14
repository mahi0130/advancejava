package transactionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class transectionhandlingwithtrycatch {
	public static void main(String[] args)throws Exception {
	Connection conn = null ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

		       conn =DriverManager.getConnection
		    		   ("jdbc:mysql://localhost:3306/transactionhandling", "root", "root");

		      
		       conn.setAutoCommit(false);
		       Statement stmt= conn.createStatement();
		       int i = stmt.executeUpdate("insert into office values(4,'ravina',5600)");
		       i = stmt.executeUpdate("insert into office values(4,'ravina',5600)");
		       i = stmt.executeUpdate("insert into office values(5,'ravina',5600)");
		       conn.commit();
		       System.out.println("data inserted="+ i);
		} catch (Exception e) {
		   conn.rollback();
		}
		
	}
}

