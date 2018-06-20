package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Shangpin;
import model.Shops;

public class ShangpinDao {
	public ArrayList<Shangpin> queryAllspInfo(Shangpin sp) throws Exception {
		ArrayList<Shangpin> list = new ArrayList<Shangpin>();
		int id = sp.getSjid();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		String sql = "select * from shangpintable where sjid=?";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		ResultSet rs=pstmt.executeQuery();
		boolean flag=rs.next();
		while(flag){
			int sjid = rs.getInt(1);
			int spid = rs.getInt(2);
			String spname=rs.getString(3);
			String spprice=rs.getString(4);
			String sppic=rs.getString(5);
			Shangpin s = new Shangpin();
			s.setSjid(sjid);
			s.setSpid(spid);
			s.setSpname(spname);
			s.setSpprice(spprice);
			s.setSppic(sppic);
			list.add(s);
			System.out.println(s);
			flag=rs.next();
	}return list;
}}