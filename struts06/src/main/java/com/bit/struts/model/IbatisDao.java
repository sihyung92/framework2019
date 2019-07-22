package com.bit.struts.model;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.bit.struts.model.entity.Struts06Vo;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class IbatisDao {
	SqlMapClient sqlMapClient;
	public IbatisDao() { 
		try {
			Reader reader = Resources.getResourceAsReader("/sqlMapConfig.xml");
			sqlMapClient=SqlMapClientBuilder.buildSqlMapClient(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Struts06Vo> getList() throws SQLException {
		return sqlMapClient.queryForList("selectAll");
	}
	
	public Struts06Vo listOne(int num) throws SQLException {
		return (Struts06Vo)sqlMapClient.queryForObject("selectOne",num);
	}

	public void insertOne(Struts06Vo bean) throws SQLException {
		sqlMapClient.insert("insertOne",bean);
	}

	public int updateOne(Struts06Vo bean) throws SQLException {
		return sqlMapClient.update("updateOne",bean);
	}

	public int deleteOne(int idx) throws SQLException {
		return sqlMapClient.delete("deleteOne",idx);
	}
	
}
