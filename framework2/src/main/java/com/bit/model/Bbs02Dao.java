package com.bit.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.bit.framework.JdbcTemplate;
import com.bit.framework.RowMapper;
import com.bit.model.entity.Bbs02Vo;

import oracle.jdbc.pool.OracleDataSource;

public class Bbs02Dao {
	DataSource dataSource;

	public Bbs02Dao() {
		try {
			OracleDataSource oracle = new OracleDataSource();
			oracle.setDriverType("oracle.jdbc.OracleDriver");
			oracle.setURL("jdbc:oracle:thin:scott/tiger@localhost:1521:xe");
			dataSource = oracle;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int insertOne(Bbs02Vo bean) throws SQLException {
		String sql = "INSERT INTO bbs02 VALUES (bbs02_seq.nextval, ?,?,?, SYSDATE)";
		JdbcTemplate<Bbs02Vo> template = new JdbcTemplate<Bbs02Vo>(dataSource);
		return template.executeUpdate(sql, bean.getName(), bean.getSub(), bean.getContent());
	}

	public List<Bbs02Vo> selectAll(String keyword) throws SQLException {
		String sql = "SELECT * FROM bbs02 WHERE sub like '%'||?||'%' ORDER BY num DESC";
		JdbcTemplate<Bbs02Vo> template = new JdbcTemplate<Bbs02Vo>(dataSource);
		RowMapper<Bbs02Vo> row = new RowMapper<Bbs02Vo>() {
			@Override
			public Bbs02Vo mapper(ResultSet rs) throws SQLException {
					Bbs02Vo bean = new Bbs02Vo();
					bean.setNum(rs.getInt("num"));
					bean.setName(rs.getString("name"));
					bean.setSub(rs.getString("sub"));
					bean.setContent(rs.getString("content"));
					bean.setNalja(rs.getDate("nalja"));
					return bean;
			};
		};
		return template.queryForList(sql, row, new Object[] { keyword });
	}
}
