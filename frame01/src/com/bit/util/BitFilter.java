package com.bit.util;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

public class BitFilter implements Filter {
	String msg;
	@Override
	public void destroy() {
		System.out.println("Destroy BitFilter...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Do BitFilter before...");
		Enumeration<String> names = request.getServletContext().getInitParameterNames();
		while(names.hasMoreElements()) {
			System.out.println(names.nextElement());
		}
		System.out.println("init param : "+msg);
		chain.doFilter(request, response);
		System.out.println("Do BitFilter after...");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init BitFilter...");
		msg=filterConfig.getInitParameter("msg2");
		/*
		 * Enumeration<String> names = filterConfig.getInitParameterNames();
		 * while(names.hasMoreElements()) { System.out.println(names.nextElement()); }
		 */
		
	}

}
