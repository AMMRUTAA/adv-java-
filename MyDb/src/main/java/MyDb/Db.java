package MyDb;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Db
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
			Logger.getLogger(MyDb.class .getName()).log(Level.SEVERE,null,ex);
		}
		catch (SQLException ex)
		{
			Logger.getLogger(MyDb.class.getName()).log(Level.SEVERE,null,ex);
		}
		return con;	
	}	
			
}	
	

	


