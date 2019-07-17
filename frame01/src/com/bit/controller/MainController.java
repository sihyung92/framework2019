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
	     logger.trace("Ȯ��");
		 logger.debug("�����");
		 logger.info("��������");
		 logger.warn("����");
		 logger.error("�����޼���");
		 logger.fatal("ġ��������");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
