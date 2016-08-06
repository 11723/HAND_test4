package com.hand.Onefilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class OneFilter implements Filter {

    public OneFilter() {
       System.out.println("=======开始调用filter======");
    }
   
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("=======开始初始化filter======");
		String zc=fConfig.getInitParameter("param");
		System.out.println("param========>"+zc);
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		
		chain.doFilter(request, response);
	}
	public void destroy() {
		System.out.println("!");
	}




}
