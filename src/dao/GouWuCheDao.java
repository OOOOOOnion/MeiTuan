package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.ArrayList;

import model.Gouwuche;

import util.JDBCUtil;

public class GouWuCheDao {

	public ArrayList<Gouwuche> addsp(Gouwuche gouwuche) {
		// TODO Auto-generated method stub
		Connection conn = null;
		conn = JDBCUtil.getConnection();
		ArrayList<Gouwuche> list = new ArrayList<Gouwuche>();
		/*System.out.println(gouwuche);*/
		String sql1 = "select * from gouwuche where   sid = ? and uid=? and spid=?";
			
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, gouwuche.getSjid());
			pstmt.setInt(2, gouwuche.getUid());
			pstmt.setInt(3, gouwuche.getSpid());
			ResultSet rs = pstmt.executeQuery();
		
			
			if(rs.next()){
				String sql3 = "update gouwuche set spnum=spnum+1 where sid = ? and uid=? and spid=?";
				/*System.out.println(1);*/
					PreparedStatement pstmt2 = conn.prepareStatement(sql3);
					pstmt2.setInt(1, gouwuche.getSjid());
					pstmt2.setInt(2, gouwuche.getUid());
					pstmt2.setInt(3, gouwuche.getSpid());
					pstmt2.executeUpdate();
			}else{
			/*	System.out.println(2);*/
				String sql2 = "insert gouwuche (sid,spid,uid,spnum,spname,price)  value(?,?,?,?,?,?)";
				PreparedStatement pstmt3 = conn.prepareStatement(sql2);
				pstmt3.setInt(1, gouwuche.getSjid());
				pstmt3.setInt(2, gouwuche.getSpid());
				pstmt3.setInt(3, gouwuche.getUid());
				pstmt3.setInt(4,1);
				pstmt3.setString(5, gouwuche.getSpname());
				pstmt3.setInt(6, gouwuche.getPrice());
				pstmt3.executeUpdate();
			}
			String sql4 = "select * from gouwuche";
			Statement stmt = conn.createStatement();
			ResultSet rs2 = stmt.executeQuery(sql4);
			while(rs2.next()){
				Gouwuche i  = new Gouwuche();
				i.setSjid(rs2.getInt("sid"));
				i.setUid(rs2.getInt("uid"));
				i.setSpid(rs2.getInt("spid"));
				i.setSpnum(rs2.getInt("spnum"));
				i.setSpname(rs2.getString("spname"));
				i.setPrice(rs.getInt("price"));
				/*System.out.println(i);*/
				list.add(i);			
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
