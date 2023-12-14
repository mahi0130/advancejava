package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//add ,update,deleted method here

import util.JDBCDataSource;

public class MarksheetModel {
	public void testadd(MarksheetBean bean) throws Exception {

//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");
//		
		Connection conn = JDBCDataSource.getConnection();

		PreparedStatement ps = conn.prepareStatement("insert into marksheet values(?,?,?,?,?,?)");
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRoll());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());

		int i = ps.executeUpdate();
		System.out.println("work done" + i);

	}

	public void update(MarksheetBean bean) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");

		PreparedStatement ps = conn.prepareStatement(
				"update marksheet set name = ?,roll = ?,  physics = ?, chemistry = ?, maths = ?, where id = ?");

		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getRoll());
		ps.setInt(4, bean.getPhysics());
		ps.setInt(5, bean.getChemistry());
		ps.setInt(6, bean.getMaths());

		ps.setInt(1, bean.getId());

		int i = ps.executeUpdate();

		System.out.println("Data Updated " + i);

	}

	public void delete(int id) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");

		PreparedStatement ps = conn.prepareStatement("delete from marksheet where id = ?");

		ps.setInt(1, id);

		int i = ps.executeUpdate();

		System.out.println("Data Deleted " + i);

	}

}
