package user;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Usermodel {

public  void add(UserBean  bean)throws Exception {
	SimpleDateFormat sdf = new SimpleDateFormat();
	Class.forName("com.mysql.cj.jdbc.Driver");

    Connection conn =DriverManager.getConnection
    		("jdbc:mysql://localhost:3306/bmt", "root", "root");
    PreparedStatement ps = 
    		conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
    ps.setInt(1, bean.getId());
    ps.setString(2, bean.getFirst_name());
    ps.setString(3, bean.getLast_name());
    ps.setString(4, bean.getLogin_id());
    ps.setString(5, bean.getPassword());
    ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
    ps.setString(7, bean.getAddress());
    int i = ps.executeUpdate();

	System.out.println("Data inserted =" + i);


}
private void forName(String string) {
	// TODO Auto-generated method stub
	
}
public void update(UserBean bean) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");	

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");
	PreparedStatement ps = conn
			.prepareStatement("update user set first_name=?,last_name=?,login_id=?password=?,dob=? address=?, where id=?");
	ps.setString(2, bean.getFirst_name());
    ps.setString(3, bean.getLast_name());
    ps.setString(4, bean.getLogin_id());
    ps.setString(5, bean.getPassword());
    ps.setDate(6, new java.sql.Date(bean.getDob().getTime()));
    ps.setString(7, bean.getAddress());
    int i = ps.executeUpdate();

	System.out.println("Data updated =" + i);


}
public void delete(int id) throws Exception {
	Class.forName("com..mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");
	PreparedStatement ps = conn.prepareStatement("delete from user where id =?");
	
	ps.setInt(1,id);

	int i = ps.executeUpdate();
	System.out.println("Data deleted =" + i);
}
public List search() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt", "root", "root");
	PreparedStatement ps = conn.prepareStatement("select * from user ");
	ResultSet rs = ps.executeQuery();
	List list = new ArrayList();
	
	while (rs.next()) {
		UserBean bean = new UserBean();
		bean.setId(rs.getInt(1));
		bean.setFirst_name(rs.getString(2));
		
		bean.setLast_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
		
		list.add(bean);
	}
	return list;

}
public UserBean findById(int id) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/advance04", "root", "root");
	PreparedStatement ps = conn.prepareStatement("select * from user where roll_no = ?");
	ps.setInt(1, id );
	ResultSet rs = ps.executeQuery();

	UserBean bean = null;

	while (rs.next()) {
		bean = new UserBean();
		bean.setId(rs.getInt(1));
		bean.setFirst_name(rs.getString(2));
		
		bean.setLast_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
	}
	return bean;

}
public List search2(UserBean bean,int page_no,int pageSize) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bmt","root","root");
	StringBuffer sql = new StringBuffer("select * from User where 1=1");
	if (bean!= null) {
		if (bean.getFirst_name() != null && bean.getFirst_name().length()>0) {
			sql.append(" and name like '"+bean.getFirst_name()+"%'");
			
		}
		if (bean.getId()>0) {
			sql.append(" and roll_no = "+bean.getId()+" ");
			
			}
		}
	if (pageSize>0) {
		
		page_no = (page_no-1)*pageSize;
		
		sql.append(" limit "+ page_no+ ", "+pageSize);
		
	}
	System.out.println("sql query........>>"+sql);
	PreparedStatement ps = conn.prepareStatement(sql.toString());
	ResultSet rs = ps.executeQuery();
	List list = new ArrayList();
	while(rs.next()) {
	 bean = new UserBean();
	
	 bean.setId(rs.getInt(1));
		bean.setFirst_name(rs.getString(2));
		
		bean.setLast_name(rs.getString(3));
		bean.setLogin_id(rs.getString(4));
		bean.setPassword(rs.getString(5));
		bean.setDob(rs.getDate(6));
		bean.setAddress(rs.getString(7));
   
   list.add(bean);
   
}
   
	return list;
	
} 
public UserBean findByPk(int pk)throws
Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/bmt", "root", "root");
PreparedStatement ps =conn.prepareStatement("select * from user where id =?");
    ps.setInt(1,pk);
     ResultSet rs = ps.executeQuery();
     UserBean bean = null;
     while (rs.next()) {
    	 bean = new UserBean();
    	 bean.setId(rs.getInt(1));
    	 
    	 bean.setFirst_name(rs.getString(2));
    	 
    	 
    	 
}
	return bean;
}

	
}
