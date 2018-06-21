package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Shops;
import util.JDBCUtil;

public class ShopInfoDao {

	public boolean modify(Shops s) {
		// TODO Auto-generated method stub
		boolean flag  = false;
		String sql = "update shops set sname=?,saccount= ? ,password = ? ,phone=? ,address= ? ,deliveryfee= ? ,deliverytime=? ,startprice= ?  where sid  = ?";
		Connection conn = JDBCUtil.getConnection(); 
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getSname());
			pstmt.setString(2, s.getSaccount());
			pstmt.setString(3, s.getPassword());
			pstmt.setString(4, s.getPhone());
			pstmt.setString(5, s.getAddress());
			pstmt.setDouble(6, s.getDeliveryfee());
			pstmt.setDouble(7, s.getDeliverytime());
			pstmt.setDouble(8, s.getStartprice());
			pstmt.setInt(9, s.getSid());
			int i = pstmt.executeUpdate();
			if(i==1){
				flag= true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}

}

