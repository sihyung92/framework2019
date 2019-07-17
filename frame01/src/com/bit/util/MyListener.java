package com.bit.util;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

public class MyListener implements ServletContextListener{
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("destroy listener...");
	}
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("init listener...");
	}
}
