package com.bit.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

@WebServlet("/")
public class MainController extends HttpServlet {
	static Logger logger = Logger.getLogger(MainController.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 //BasicConfigurator.configure();
		// trace > debug > info > warn > error > fatal
	     logger.trace("확인");
		 logger.debug("디버깅");
		 logger.info("정보제공");
		 logger.warn("주의");
		 logger.error("에러메세지");
		 logger.fatal("치명적에러");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
