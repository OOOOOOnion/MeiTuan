package util;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCUtil {
	private static Connection conn;
    private static ComboPooledDataSource ds = new ComboPooledDataSource();

    public static Connection getConnection() {
        try {
            conn = ds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void main(String[] args) throws SQLException {  
        Connection con = null;  
        try {  
            con = JDBCUtil.getConnection();  
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM user");  
            while (rs.next()) {  
                System.out.print("id:"+rs.getObject(1)+";");  
                System.out.print("username:"+rs.getObject(2)+";");  
                System.out.print("password:"+rs.getObject(3)+";");  
                System.out.print("age:"+rs.getObject(3)+";"); 
                System.out.println("---------------------");
            }  
        } catch (Exception e) {  
        } finally {  
            if (con != null)  
                con.close();  
        }  
    }  
}
