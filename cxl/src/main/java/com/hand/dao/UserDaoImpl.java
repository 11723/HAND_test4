package com.hand.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.entities.Customer;
import com.hand.entities.Film;
import com.hand.entities.User;

public class UserDaoImpl implements UserDao {

	public void save(Connection conn, User user) throws SQLException {
		String zc="insert into tbl_user(name,password,email) values (?,?,?)";
		PreparedStatement ps=conn.prepareCall(zc);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.execute();
	}

	public void update(Connection conn, int id, User user) throws SQLException {
		PreparedStatement ps=conn.prepareStatement("update tbl_user set name=?,password=?,email=? where id=?");
		
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setInt(4, id);
		ps.execute();
	}

	public void delete(Connection conn, User user) throws SQLException {
		PreparedStatement ps=conn.prepareStatement("delete from tbl_user where id=?");
		ps.setInt(1, user.getId());
		ps.execute();
	}



	public ResultSet get(Connection conn, Customer customer) throws SQLException {
		PreparedStatement ps=conn.prepareStatement("select * from customer where first_name=?");
		ps.setString(1, customer.getFirst_name());
		
		return ps.executeQuery();
	}

	public ResultSet getAllFilmList(Connection conn) throws SQLException {
		  PreparedStatement ps = conn.prepareStatement("select * FROM  film");
	        return ps.executeQuery();
//	        List<Film> films = new ArrayList<Film>();
//	        while (rs.next()){
//	            Film film = new Film();
//	            film.setId(rs.getInt(1));
//	            film.setTitle(rs.getString(2));
//	            film.setDescription(rs.getString(3));
//	            film.setYear(rs.getDate(4));
//	            film.setLanguage_id(rs.getLong(5));
//	            film.setOriginal_language_id(rs.getInt(6));
//	            film.setRental_duration(rs.getInt(7));
//	            film.setRental_rate(rs.getBigDecimal(8));
//	            film.setLength(rs.getInt(9));
//	            film.setReplacement_cost(rs.getBigDecimal(10));
//	            film.setRating(rs.getString(11));
//	            film.setSpecial_features(rs.getString(12));
//	            film.setLast_update(rs.getTimestamp(13));
//	            films.add(film);
//	        }

	       
	        //return rs;
	}

}
