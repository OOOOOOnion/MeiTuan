package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Shops;
import model.Users;
import util.JDBCUtil;

public class SjRegisterDao {
	public boolean register(Shops s) {
		boolean flag = false;
		Connection conn = null;  
		conn = JDBCUtil.getConnection();
		String sql = "insert into shops (sname,saccount,password)  value(?,?,?)";
		try {
				
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, s.getSname());
				pstmt.setString(2, s.getSaccount());
				pstmt.setString(3, s.getPassword());
			    pstmt.executeUpdate();
			    flag = true;
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(flag);
		return flag;
		

		}
}
