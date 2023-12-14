package util;

import java.beans.PropertyVetoException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//4 step follow to create a jdbc datasource class 
//1 make class final for no one onbject over lifetime
//2 make static same type of variable
//3 create private default constroctor
//4 create jdbc getinstance & getconnection method

public final class JDBCDataSource {

	private static JDBCDataSource jds = null;
	private ComboPooledDataSource ds = null;
	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.app");

	private JDBCDataSource() {

		try {
			ds = new ComboPooledDataSource();
			ds.setDriverClass(rb.getString("driver"));
			ds.setJdbcUrl(rb.getString("url"));
			ds.setUser(rb.getString("username"));
			ds.setPassword(rb.getString("password"));
			ds.setInitialPoolSize(Integer.parseInt(rb.getString("initialpoolsize")));
			ds.setAcquireIncrement(Integer.parseInt(rb.getString("acquireincrement")));
			ds.setMaxPoolSize(Integer.parseInt(rb.getString("maxpoolsize")));

		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
	}

	public static JDBCDataSource getInstance() {
		if (jds == null) {
			jds = new JDBCDataSource();
		}
		return jds;

	}

	public static Connection getConnection() {
		try {
			return getInstance().ds.getConnection();
		} catch (SQLException e) {
			return null;
		}
	}

}