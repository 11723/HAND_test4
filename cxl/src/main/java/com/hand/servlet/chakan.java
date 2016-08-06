package com.hand.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.Service.chaxun;
import com.hand.entities.Film;

/**
 * Servlet implementation class chakan
 */
public class chakan extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public chaxun cx=new chaxun();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chakan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=null;
		String forward=null;
		List<Film> lists=null;
		
		lists=new ArrayList<Film>();
		lists=cx.cha();
		//Map<String,Object> map=new HashMap<String, Object>();
		forward="/da1/chakan.jsp";
		request.setAttribute("lists",lists);
		
		rd=request.getRequestDispatcher(forward);
		rd.forward(request, response);
		//List<Film> getAllFilmList
		
	}

}
