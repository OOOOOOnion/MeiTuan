package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Dingdan;
import model.Shangpin;

public class DingdanDao {
	public void addDingdanInfo(Dingdan dingdan) throws Exception {
		String ddid = dingdan.getDdid();
		String ddname=dingdan.getDdname();
		String ddprice=dingdan.getDdprice();
		String ddpic=dingdan.getDdpic();
		String ddnum=dingdan.getDdnum();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		String sql = "INSERT INTO dingdantextTwo VALUES (?,?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,ddid);
		pstmt.setString(2,ddname);
		pstmt.setString(3,ddprice);
		pstmt.setString(4,ddpic);
		pstmt.setString(5,ddnum);
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		
	}
}
