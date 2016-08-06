package com.hand.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.hand.entities.Customer;
import com.hand.entities.Film;
import com.hand.entities.User;

public interface UserDao {
	public void save(Connection conn,User user)throws SQLException;
	public void update(Connection conn,int id,User user)throws SQLException;
	public void delete(Connection conn,User user)throws SQLException;
	public  ResultSet get(Connection conn,Customer customer)throws SQLException;
	public ResultSet getAllFilmList(Connection conn) throws SQLException;
}
