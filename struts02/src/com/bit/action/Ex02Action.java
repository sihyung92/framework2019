package com.bit.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.Action;

public class Ex02Action implements Action{
	Logger log = Logger.getLogger("com.bit.action.Ex02Action");
	@Override
	public String execute() throws Exception {
		log.debug("ȣ��");
		return this.SUCCESS;
	}

}
