package transactionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Transactionhandling {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");

	      Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/transactionhandling", "root", "root");

	      
	       conn.setAutoCommit(false);
	       Statement stmt= conn.createStatement();
	       int i = stmt.executeUpdate("insert into office values(1,'ravina',5600)");
	       i = stmt.executeUpdate("insert into office values(2,'ravina',5600)");
	       i = stmt.executeUpdate("insert into office values(3,'ravina',5600)");
	       conn.commit();
	       System.out.println("data inserted="+ i);
		
	}

}
