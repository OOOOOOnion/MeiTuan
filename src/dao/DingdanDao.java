package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class DingdanDao {

	public void creatOrderByUser(int uid, int sid) {
		// TODO Auto-generated method stub
		Connection conn = null;
		conn = JDBCUtil.getConnection();
		String sql1 = "select max(oid) from dingdan";
		int i =0;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql1);
			if(rs.next()){
				i=rs.getInt(1)+1;
			}
			System.out.println(i);
		
		
		
		String sql2 = "select * from gouwuche where uid=? and sid=?";
		
			PreparedStatement pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, uid);
			pstmt.setInt(2,sid );
			ResultSet rs2 = pstmt.executeQuery();
			
			while(rs2.next()){
				String sql3 = "insert dingdan (oid,sid,uid,spid,spnum,spprice,totalprice,state) value(?,?,?,?,?,?,?,?)";
				PreparedStatement pstmt2 = conn.prepareStatement(sql3);
				pstmt2.setInt(1, i);
				pstmt2.setInt(2,sid );
				pstmt2.setInt(3, uid);
				pstmt2.setInt(4, rs2.getInt("spid"));
				pstmt2.setInt(5, rs2.getInt("spnum"));
				pstmt2.setInt(6, rs2.getInt("price"));
				pstmt2.setInt(7,rs2.getInt("spnum") * rs2.getInt("price"));
				pstmt2.setString(8, "待接单");
				pstmt2.executeUpdate();
				
			}
			String sql4 = "delete from gouwuche where sid=? and uid=?";
			PreparedStatement pstmt3 = conn.prepareStatement(sql4);
		
			pstmt3.setInt(1,sid );
			pstmt3.setInt(2, uid);
			pstmt3.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
