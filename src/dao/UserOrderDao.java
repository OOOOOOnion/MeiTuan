package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.PageBean;
import model.Order;

import util.JDBCUtil;

public class UserOrderDao {

	public int QueryAllOrder() {
		// TODO Auto-generated method stub
		int size=0;
		String sql = "select count(*) from dingdan";
		Connection conn = JDBCUtil.getConnection();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()){
				size=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return size;
	}

	public ArrayList<Order> QueryOrderByPage(PageBean pageBean) {
		ArrayList<Order> list = new ArrayList<>();
		// TODO Auto-generated method stub
		try {
			Connection conn = JDBCUtil.getConnection();
			int page = pageBean.getPage();
			int pagesize = pageBean.getPagesize();

			String sql2 = "select * from dingdan limit ?,?";
			PreparedStatement pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, (page - 1) * pagesize);
			pstmt.setInt(2, pagesize);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Order o = new Order();
				o.setOid(rs.getInt("oid"));
				o.setSid(rs.getInt("sid"));
				o.setUid(rs.getInt("uid"));
				o.setSpid(rs.getInt("spid"));
				o.setSpnum(rs.getInt("spnum"));
				o.setSpprice(rs.getDouble("spprice"));
				o.setTotalprice(rs.getDouble("totalprice"));
				o.setState(rs.getString("state"));
				System.out.println(o);
				list.add(o);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	
	}
	
}
