package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
				exitsu.setUname(rs.getString("uname"));
				
				/*exitsu.setPassword(rs.getString("password"));
				dbuser.setAge(rs.getInt("age"));
				dbuser.setPhone(rs.getString("phone"));
				dbuser.setAddress(rs.getString("address"));*/
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
}
