package com.bit.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.log4j.Logger;

@WebFilter("/*")
public class MyFilter implements Filter {
	Logger log = Logger.getLogger("com.bit.util");
	@Override
	public void destroy() {
		log.debug("Destroy Filter...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.debug("Do Filter before...");
		chain.doFilter(request, response);
		log.debug("Do Filter after...");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.debug("init Filter...");
	}
	
}
