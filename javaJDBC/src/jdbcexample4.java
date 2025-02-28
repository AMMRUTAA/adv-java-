
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class jdbcexample4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Creating a connection
			String url="jdbc:mysql://localhost:3306/mydb1";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			String q="insert into student (name,city) value(?,?)";
			PreparedStatement pstmt= con.prepareStatement(q);
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter Name : ");
			String Name = dis.readLine();
			
			System.out.println("Enter City : ");
			String City = dis.readLine();
			
			pstmt.setString(1, Name);
			
			pstmt.setString(2, City);
			
			pstmt.executeUpdate();
			
			System.out.println("Inserted.....");
			
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
