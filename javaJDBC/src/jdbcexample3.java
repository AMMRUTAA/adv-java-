import java.sql.*;
public class jdbcexample3 {

	public static void main(String[] args) {
		try {
  Class.forName("com.mysql.jdbc.Driver");
  //creating a connection
  String url="jdbc:mysql://localhost:3306/mydb1";
  String username="root";
  String password="root";
  Connection con=DriverManager.getConnection(url,username,password);
  String q="insert into student (name,city) value(?,?)";
  PreparedStatement pstmt= con.prepareStatement(q);
  pstmt.setString(1,"Rahul shah");
  pstmt.setString(2, "Goa");
  pstmt.executeUpdate();
  //insert second entry
  pstmt.setString(1,"Jay shah");
  pstmt.setString(2,"Goa");
  pstmt.executeUpdate();
//insert third entry
  pstmt.setString(1,"Meena shah");
  pstmt.setString(2,"Goa");
  pstmt.executeUpdate();
System.out.println("Inserted...");
con.close();
}catch(Exception e) {
	e.printStackTrace();
}
	}
}
