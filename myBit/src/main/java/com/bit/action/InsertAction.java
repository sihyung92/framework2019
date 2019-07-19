package com.bit.action;

import com.bit.model.entity.Struts04Dao;
import com.bit.model.entity.Struts04Dto;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class InsertAction implements Action,ModelDriven<Struts04Dto>,Preparable {
	Struts04Dto bean;
	
	public Struts04Dto getBean() {
		return bean;
	}
	
	public String execute() throws Exception {
		new Struts04Dao().insertOne(bean);
		return SUCCESS;
	}

	public void prepare() throws Exception {
		bean=new Struts04Dto();
	}

	public Struts04Dto getModel() {
		return bean;
	}

}
