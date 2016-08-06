package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Service.checkUserService;
import com.hand.entities.Customer;
import com.hand.entities.User;

/**
 * Servlet implementation class checkServlet
 */
public class checkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public checkUserService cus=new checkUserService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checkServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("first_name");
		
		//String returnUri=request.getParameter("return_uri");
		//System.out.println(uname+"-----"+pwd+"-----"+request+"------");
		RequestDispatcher rd=null;
		String forward=null;
		if(uname==null)
		{
			request.setAttribute("msg","对不起，用户名或密码为空");
			rd=request.getRequestDispatcher("/da/error.jsp");
			
		}
		else{
			Customer customer=new Customer();
			customer.setFirst_name(uname);
			//user.setPassword(pwd);
			System.out.println("----"+cus);
			
			boolean bool=cus.check(customer);
			
			if(bool){
				forward="/da/success.jsp";
			}else{
				request.setAttribute("msg", "账户或者密码错误");
				forward="/da/login.jsp";
			}
			System.out.println(forward+"==========="+rd);
			rd=request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
	}
	
	
	

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}



}
