package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Shangpin;
import model.Shops;
import model.Users;
import util.JDBCUtil;

public class SjLoginDao {
	public Shops sjlogin(Shops shops){
		
		
		Shops exitssj = new Shops();
		Connection conn = null;  
		conn = JDBCUtil.getConnection();
		String sql  = "select * from shops where saccount=? and password=?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, shops.getSaccount());
			pstmt.setString(2, shops.getPassword());
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				exitssj.setSid(rs.getInt("sid"));
				exitssj.setSpic(rs.getString("spic"));
				exitssj.setSname(rs.getString("sname"));
				exitssj.setAddress(rs.getString("address"));
				exitssj.setPassword(rs.getString("password"));
				exitssj.setPhone(rs.getString("phone"));
				exitssj.setSaccount(rs.getString("saccount"));
				return exitssj;
			}else{
				
				return null;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exitssj;

	}}
