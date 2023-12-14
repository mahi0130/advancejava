package Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//for run any query you have to make stattement object first Statement is  not dynamic

public class Testadd {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/statement", "root", "root");
		Statement stmt = conn.createStatement();
		int i =stmt.executeUpdate("insert into work values(1,'misha',200000)");
		System.out.println("work done"+i);
	}

}
