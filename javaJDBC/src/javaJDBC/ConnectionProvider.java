package javaJDBC;
import java.sql.*;
import java.io.*;

public class ConnectionProvider {
	private static Connection con;
	public static Connection getConnection() {
		try {
			if(con == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/mydb1";
				String username = "root";
				String password = "root";
				con = DriverManager.getConnection(url,username,password);
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}