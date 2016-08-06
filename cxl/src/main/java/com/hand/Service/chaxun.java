package com.hand.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;

import com.hand.entities.Film;

import com.util.ConnectionFactory;

public class chaxun {
private UserDao userdao=new UserDaoImpl();
public List<Film> cha(){
	Connection conn=null;
	List<Film> films=null;
	try {
		ConnectionFactory  fac=ConnectionFactory.getInstance();
		conn=fac.makeConnection();
		System.out.println("------------conn:"+conn+"------fac:"+fac);
		conn.setAutoCommit(false);
		ResultSet rs=userdao.getAllFilmList(conn);
		 films = new ArrayList<Film>();
	        while (rs.next()){
	            Film film = new Film();
	            film.setId(rs.getInt(1));
	            film.setTitle(rs.getString(2));
	            film.setDescription(rs.getString(3));
	            film.setYear(rs.getDate(4));
	            film.setLanguage_id(rs.getLong(5));
	            film.setOriginal_language_id(rs.getInt(6));
	            film.setRental_duration(rs.getInt(7));
	            film.setRental_rate(rs.getBigDecimal(8));
	            film.setLength(rs.getInt(9));
	            film.setReplacement_cost(rs.getBigDecimal(10));
	            film.setRating(rs.getString(11));
	            film.setSpecial_features(rs.getString(12));
	            film.setLast_update(rs.getTimestamp(13));
	            films.add(film);
	        }
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return films;
}


}
