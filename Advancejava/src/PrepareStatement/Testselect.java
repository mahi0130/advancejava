package PrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Testselect {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/prepareStatement", "root", "root");
		PreparedStatement ps=conn.prepareStatement("select * from work");
		ResultSet rs =ps.executeQuery();
		while (rs.next()) {
			System.out.print("\t"+rs.getInt(1));
			System.out.print("\t"+rs.getString(2));
			System.out.println(rs.getInt(3));

}
	}
}
