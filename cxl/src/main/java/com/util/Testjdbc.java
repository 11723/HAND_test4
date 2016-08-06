package com.util;

import java.sql.Connection;
import java.sql.SQLException;

public class Testjdbc {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
ConnectionFactory cf=ConnectionFactory.getInstance();
Connection conn=cf.makeConnection();
try {
	System.out.println(conn.getAutoCommit());
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
