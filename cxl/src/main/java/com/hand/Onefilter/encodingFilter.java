package com.hand.Onefilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet Filter implementation class encodingFilter
 */
public class encodingFilter implements Filter {
private String charEncoding=null;
    public encodingFilter() {
        // TODO Auto-generated constructor stub
    }

	public void init(FilterConfig fConfig) throws ServletException {
		 charEncoding=fConfig.getInitParameter("encoding");
		if(charEncoding==null)
		{
			throw new ServletException("ServletException!!!");
		}
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	if(charEncoding.equals(request.getCharacterEncoding()))
	{
		HttpServletRequest req = (HttpServletRequest)request;
		req.setCharacterEncoding(charEncoding);
	}
	HttpServletResponse res = (HttpServletResponse)response;
	res.setCharacterEncoding(charEncoding);
	chain.doFilter(request, response);
	}



	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}


}
