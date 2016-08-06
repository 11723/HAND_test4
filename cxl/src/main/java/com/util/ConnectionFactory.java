package com.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

	private static String driver;
	private static String dburl;
	private static String user;
	private static String password;
	private static final ConnectionFactory factory = new ConnectionFactory();
	private Connection conn;

	static {
		Properties prop = new Properties();
		try {
			InputStream in = ConnectionFactory.class.getClassLoader()
					.getResourceAsStream("/DbUtil.properties");
			// InputStream
			// in2=ConnectionFactory.class.getResourceAsStream("DbUtil.properties");
			System.out.println(in + "!!!!!!!!!!");
			prop.load(in);
		} catch (Exception e) {

		}
		driver = prop.getProperty("driver");
		dburl = prop.getProperty("dburl");
		user = prop.getProperty("user");
		password = prop.getProperty("password");
		System.out.println("_+_+_+_+_+_+_+__+" + dburl + "---" + dburl + "----" + password + "-----");

	}

	private ConnectionFactory() {
	}

	public static ConnectionFactory getInstance() {

		return factory;
	}

	public Connection makeConnection() {
		try {
			System.out.println("进来没有？" + driver);

			Class.forName(driver);
			conn = DriverManager.getConnection(dburl, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("lalalalal====" + conn);
		return conn;

	}

}
