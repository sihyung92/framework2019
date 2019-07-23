package com.bit.framework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TemplateUpdate {
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
	
	public int executeUpdate(String sql, Object[] objs) throws SQLException {
		Connection conn = getConnection();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			for(int i=0; i<objs.length; i++) {
				pstmt.setObject(i+1,objs[i]);
			}
			return pstmt.executeUpdate();
		}finally {
			closeAll(conn, pstmt, null);
		}
	}
}
