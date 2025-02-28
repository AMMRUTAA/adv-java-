package CookiesExample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet</title>");
            out.println("</head>");
            out.println("<body>");
            String name = request.getParameter("name");
            out.println("<h1>Hello, " + name + " Welcome to my website.....</h1>");
            
            // Create a Cookie
            Cookie c = new Cookie("user_name", name);
            response.addCookie(c);
            
            out.println("</body>");
            out.println("</html>");
        }
    }
}
