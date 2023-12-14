package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class TestDelete {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/prepareStatement", "root", "root");
		PreparedStatement ps=conn.prepareStatement("delete from work where id = 1");
		int i=ps.executeUpdate();
		System.out.println("done work="+i);

}
	}
