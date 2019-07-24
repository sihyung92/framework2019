package com.bit.model;


import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bit.model.entity.Bbs02Vo;

import junit.framework.Assert;

public class Bbs02DaoTest {
	static Bbs02Dao dao;
	//Assert.assertNotNull(dao.getConnection()); //null != 성공
	//Assert.assertNull(null); //null ==성공
	//Assert.assertEquals(1, 1); //same == 성공 .equals()로 비교
	//Assert.assertSame(1, 2); // same == 성공
	//Assert.assertNotSame(1, 2); // same != 성공
	//Assert.assertTrue(true); //true == 성공
	//Assert.assertFalse(false); //false == 성공
	
	@BeforeClass
	public static void beforeClass() {
		//dao = new Bbs02Dao();
	}
	
	@AfterClass
	public static void afterClass() {
	}
	
	@Before
	public void setUp() {
		dao = new Bbs02Dao();
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void testInsertOne() throws SQLException {
		Bbs02Vo bean = new Bbs02Vo();
		bean.setName("tester");
		bean.setSub("test");
		bean.setContent("testD");
		assertSame(1, dao.insertOne(bean)); //첫번째 인자 기대값, 두번째 인자 실제 결과값
	}
	
	@Test
	public void testSelectAll() throws SQLException {
		assertNotNull(dao.selectAll("test01"));
		assertTrue(dao.selectAll("test01").size()>0);
		assertSame(1, dao.selectAll("test01").size());
	}
}
