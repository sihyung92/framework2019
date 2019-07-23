package com.bit.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.framework.JdbcTemplate;
import com.bit.model.entity.Bbs02Vo;

public class Bbs02Dao1 {

	static final private String DRIVER = "oracle.jdbc.OracleDriver";
	static final private String URL = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";

	public Bbs02Dao1() {
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			if (conn == null || conn.isClosed()) {
				Class.forName(DRIVER);
				conn = DriverManager.getConnection(URL);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}

	JdbcTemplate template = new JdbcTemplate() {
		@Override
		public Object mapper(ResultSet rs) throws SQLException {
			Bbs02Vo bean = new Bbs02Vo();
			bean.setNum(rs.getInt("num"));
			bean.setName(rs.getString("name"));
			bean.setSub(rs.getString("sub"));
			bean.setNalja(rs.getDate("Nalja"));
			bean.setContent(rs.getString("content"));
			return bean;
		}
	};

	public List getList() throws SQLException {
		String sql = "SELECT * FROM BBS02 ORDER BY num DESC";
		return template.executeQuery(sql, new Object[] {});
	}

	public Bbs02Vo selectOne(int num) throws SQLException {
		String sql = "SELECT * FROM bbs02 WHERE num=?";
		return (Bbs02Vo) template.executeQuery(sql, new Object[] { num }).get(0);
	}

	public void insertOne(String name, String sub, String content) throws SQLException {
		String sql = "INSERT INTO bbs02 VALUES (bbs02_seq.nextval, ?, ?, ?, SYSDATE)";
		Object[] objs = { name, sub, content };
		template.executeUpdate(sql, objs);
	}

	public int updateOne(Bbs02Vo bean) throws SQLException {
		String sql = "UPDATE BBS02 SET sub=?,content=? WHERE num=?";
		Object[] objs = { bean.getSub(), bean.getContent(), bean.getNum() };
		return template.executeUpdate(sql, objs);
	}

	public int deleteOne(int num) throws SQLException {
		String sql = "DELETE FROM bbs02 WHERE num=?";
		Object[] objs = { num };
		return template.executeUpdate(sql, objs);
	}

	public void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs) throws SQLException {
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}
}