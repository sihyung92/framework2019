package com.bit.model.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Struts04Dao {
	private String driver = "oracle.jdbc.OracleDriver";
	private String url = "jdbc:oracle:thin:scott/tiger@localhost:1521:xe";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Struts04Dao() {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Struts04Dto> getList(){
		List<Struts04Dto> list = new ArrayList<Struts04Dto>(); 
		String sql ="SELECT num,sub,name,nalja FROM STRUTS04 ORDER BY NUM DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			System.out.println("while(rs)Àü");
			while(rs.next()) {
				System.out.println("while(rs)¾È");
				list.add(new Struts04Dto(
					rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getDate(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(rs!=null)rs.close();
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}
	
	public void insertOne(Struts04Dto bean) {
		String sql ="INSERT INTO struts04 (num,sub,name,content,nalja) VALUES (struts04_seq.nextval,?,?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bean.getSub());
			pstmt.setString(2, bean.getName());
			pstmt.setString(3, bean.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
				try {
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
