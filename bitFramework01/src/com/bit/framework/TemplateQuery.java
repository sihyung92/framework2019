package com.bit.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.model.entity.Bbs02Vo;

public abstract class TemplateQuery {
	static final private String DRIVER = "oracle.jdbc.OracleDriver";
	static final private String URL = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe"; 
	
	public Connection getConnection(){
		Connection conn=null;
		try {
			if (conn == null || conn.isClosed()) {
				Class.forName(DRIVER);
				conn=DriverManager.getConnection(URL);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void closeAll(Connection conn, PreparedStatement pstmt, ResultSet rs) throws SQLException {
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(conn!=null)conn.close();
	}
	
	public List executeQuery(String sql,Object[] objs) throws SQLException {
		
		List list = new ArrayList();
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++) {
				pstmt.setObject(i+1, objs[i]);
			}
			rs=pstmt.executeQuery();
			while(rs.next()) {
				list.add(mapper(rs));
			}
		} finally {
			closeAll(conn, pstmt, rs);
		}
		return list;
	}
	
	public abstract Object mapper(ResultSet rs) throws SQLException;
}
