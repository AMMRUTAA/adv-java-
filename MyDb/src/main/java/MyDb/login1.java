package MyDb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class login1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String uname = request.getParameter("uname");
            String pass = request.getParameter("pass");
            login1 db = new login1();
            Connection con = db.getCon();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into register (name, password) values('" + uname + "','" + pass + "')");
            out.println("Data Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(login1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getCon() {
        Connection con = null;
        try {
            // Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourdatabase", "yourusername", "yourpassword");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
