package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testadd {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/preparestatement", "root", "root");
		PreparedStatement ps =conn.prepareStatement("insert into work values(1,'misha',200000)");
		int i =ps.executeUpdate();
		System.out.println("work done"+i);
	}
	
		
	

}

