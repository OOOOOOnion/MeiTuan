package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import model.Users;
import util.JDBCUtil;

public class UserDao {
	
	public Users login(Users u){
		Users exitsu = new Users();
		Connection conn = null;  
		conn = JDBCUtil.getConnection();
		String sql  = "select * from users where uaccount = ? and password = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u.getUaccount());
			pstmt.setString(2, u.getPassword());
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				exitsu.setUid(rs.getInt("uid"));
				exitsu.setUname(rs.getString("uname"));
				exitsu.setUaccount(rs.getString("uaccount"));
				exitsu.setPassword(rs.getString("password"));
				exitsu.setAddress(rs.getString("address"));
				exitsu.setPhone(rs.getString("phone"));
				
				
				return exitsu;
			}else{
				
				return null;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exitsu;
		
		
	}

	public boolean register(Users regu) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Connection conn = null;  
		conn = JDBCUtil.getConnection();
		String sql = "insert users (uname,uaccount,password)  value(?,?,?)";
		try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, regu.getUaccount());
				pstmt.setString(2, regu.getUaccount());
				pstmt.setString(3, regu.getPassword());
				int i = pstmt.executeUpdate();
				
				if (i == 1) {
					flag = true;
				} else {
					flag = false;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(flag);

		return flag;
		}

	public boolean isUserExists(String ua) {
		boolean flag = false;
		Connection conn = null;  
		conn = JDBCUtil.getConnection();
		String sql  = "select * from users where uaccount = ? ";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ua);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				flag = true;
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
		
	}

	public boolean modify(Users u) {
		// TODO Auto-generated method stub
		boolean flag = false;

		Connection conn = null;  
		conn = JDBCUtil.getConnection();
		String sql = "update users set uname=?,uaccount=?,password=?,phone=?,address=? whrer uid=?";
		try {
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, u.getUname());
				pstmt.setString(2, u.getUaccount());
				pstmt.setString(3, u.getPassword());
				pstmt.setString(4, u.getPhone());
				pstmt.setString(5, u.getAddress());
				pstmt.setInt(6, u.getUid());
				int i = pstmt.executeUpdate();
				
				if (i == 1) {
					flag = true;
				} else {
					flag = false;
				}
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public Admin adminlogin(Admin admin){
		Admin a = new Admin();
		Connection conn = null;  
		conn = JDBCUtil.getConnection();
		String sql  = "select * from admin where adminaccount = ? and adminpassword = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a.getAdminaccount());
			pstmt.setString(2, a.getAdminpassword());
			ResultSet rs = pstmt.executeQuery();

			if(rs.next()){
				a.setAdminaccount(rs.getString("adminaccount"));
				a.setAdminpassword(rs.getString("adminpassword"));
				return a;
			}else{
				
				return null;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
		
		
	}
}
