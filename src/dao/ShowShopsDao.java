package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bean.PageBean;
import model.Shops;
import util.JDBCUtil;

public class ShowShopsDao {

	public ArrayList<Shops> QueryShopsByPage(PageBean pagebean) {
		ArrayList<Shops> list = new ArrayList<Shops>();
		Connection conn = JDBCUtil.getConnection();
		String sql = "select * from shops limit ?,?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, (pagebean.getPage()-1)*pagebean.getPagesize());
			pstmt.setInt(2, pagebean.getPagesize());
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Shops s = new Shops();
				s.setSid(rs.getInt("sid"));
				s.setSname(rs.getString("sname"));
				s.setAddress(rs.getString("address"));
				s.setSpic(rs.getString("spic"));
				s.setStartprice(rs.getDouble("startprice"));
				s.setDeliveryfee(rs.getDouble("deliveryfee"));
				s.setDeliverytime(rs.getDouble("deliverytime"));
				//System.out.println(s);
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			 
		return list;
		
		
	}
	
}
