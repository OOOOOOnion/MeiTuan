package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Dingdan;
import model.Shops;

public class SjToSpDao {
	public ArrayList<Shops>sjtospdao(Shops shops) throws Exception{
		ArrayList<Shops> list = new ArrayList<Shops>();
		int id = shops.getSid();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		String sql = "select * from shops where sid=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		boolean flag=rs.next();
		while(flag){
			int sid = rs.getInt(1);
			String sname=rs.getString(2);
			String spic=rs.getString(5);
			double startprices=rs.getDouble(8);
			double deliveryfee=rs.getDouble(9);
			double deliverytime=rs.getDouble(10);
			Shops s = new Shops();
			s.setSid(sid);
			s.setSname(sname);
			s.setSpic(spic);
			s.setStartprice(startprices);
			s.setDeliveryfee(deliveryfee);
			s.setDeliverytime(deliverytime);
			System.out.println(sname);
			list.add(s);
			flag=rs.next();
		}
		return list;
}}
