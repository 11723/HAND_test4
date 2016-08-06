package com.hand.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;
import com.hand.entities.Customer;
import com.hand.entities.User;
import com.util.ConnectionFactory;

public class checkUserService {
private UserDao userdao=new UserDaoImpl();
public boolean check(Customer customer){
	Connection conn=null;
	try {
		ConnectionFactory  fac=ConnectionFactory.getInstance();
		conn=fac.makeConnection();
		System.out.println("------------conn:"+conn+"------fac:"+fac);
		conn.setAutoCommit(false);
		ResultSet resultSet=userdao.get(conn, customer);
		while(resultSet.next())
		{
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		try {
			conn.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}finally{
		try {
			
		} catch (Exception e2) {
			try {
				conn.close();
			} catch (SQLException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
		}
		
	}
	
	return false;
	
}


}
