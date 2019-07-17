package com.bit.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Struts03Dao {
	Connection conn;
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:hr/hr@localhost:1521:xe";
	PreparedStatement pstmt;
	ResultSet rs;
	
	public Connection getConnection() {
		try {
			if(conn==null||conn.isClosed()) {
				Class.forName(driver);
				conn=DriverManager.getConnection(url);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public ArrayList<Struts03Dto> getList(){
		ArrayList<Struts03Dto> list= new ArrayList<Struts03Dto>();
		try(Connection conn = getConnection()){
			String sql = "select num, sub from struts03 order by num desc";
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Struts03Dto bean = new Struts03Dto();
				bean.setNum(rs.getInt(1));
				bean.setSub(rs.getString(2));
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}
}
