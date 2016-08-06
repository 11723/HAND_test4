import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.hand.dao.UserDao;
import com.hand.dao.UserDaoImpl;
import com.hand.entities.User;
import com.util.ConnectionFactory;

public class Test {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			UserDao userdao=new UserDaoImpl();
		
			conn=ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			//ResultSet rs=userDao
//			UserDao userdao=new UserDaoImpl();
//			User tom=new User();
//			tom.setName("qqq");
//			tom.setPassword("3333");
//			tom.setEmail("2222");
//			userdao.save(conn, tom);
//			conn.commit();
			
		} catch (Exception e) {
			try {
				System.out.println("sorry");
				
				conn.rollback();
			} catch (Exception e2) {
				
			}
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
