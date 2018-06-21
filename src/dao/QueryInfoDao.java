package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Shops;
import model.Users;

public class QueryInfoDao {
	public ArrayList<Users> queryAllUser() throws Exception {
		ArrayList<Users> list = new ArrayList<Users>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		String sql = "select * from users";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (true) {
			boolean flag = rs.next();
			if (!flag) {
				break;
			}
			String uname = rs.getString(1);
			String uaccount=rs.getString(2);
			String upassword = rs.getString(3);	
			String uphone = rs.getString(5);	
			String uaddress=rs.getString(6);
			Users users = new Users();
			users.setUname(uname);
			users.setUaccount(uaccount);
			users.setPassword(upassword);
			users.setPhone(uphone);
			users.setAddress(uaddress);

			list.add(users);
		}
		conn.close();

		return list;
}
	
	
public ArrayList<Shops> queryAllsj() throws Exception {
		ArrayList<Shops> sjlist = new ArrayList<Shops>();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
		String sql = "select * from shops";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (true) {
			boolean flag = rs.next();
			if (!flag) {
				break;
			}
			String sname = rs.getString(1);
			String saccount=rs.getString(2);
			String spassword = rs.getString(3);	
			String sphone = rs.getString(5);	
			String saddress=rs.getString(6);
			Shops s = new Shops();
			s.setSname(sname);
			s.setSaccount(saccount);
			s.setPassword(spassword);
			s.setPhone(sphone);
			s.setAddress(saddress);

			sjlist.add(s);
		}
		conn.close();

		return sjlist;
}
}