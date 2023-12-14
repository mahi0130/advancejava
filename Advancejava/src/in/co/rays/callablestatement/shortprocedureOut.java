package in.co.rays.callablestatement;

import java.sql.CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class shortprocedureOut {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");

		CallableStatement callStmt = conn.prepareCall("{CALL deskOut(?)}");
callStmt.registerOutParameter(1, Types.INTEGER);
callStmt.execute();
System.out.println(callStmt.getInt(1));

}
}
