package MyDB1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Database
{
	Connection con;
	public Connection postCon()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbs.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		}
		catch(ClassNotFoundException ex)
		{
			Logger.getLogger(Database.class .getName()).log(Level.SEVERE,null,ex);
		}
		catch (SQLException ex)
		{
			Logger.getLogger(Database.class.getName()).log(Level.SEVERE,null,ex);
		}
		return con;	
	}	
			
}