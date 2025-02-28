package CookiesExample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

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
            // Getting Cookies
            Cookie[] cookies = request.getCookies();
            boolean f = false;
            String name = "";
            if (cookies == null) {
                out.println("<h1>You are a new user. Go to the home page and submit your name.</h1>");
                return;
            } else {
                for (Cookie c : cookies) {
                    String tname = c.getName();
                    if (tname.equals("user_name")) {
                        f = true;
                        name = c.getValue();
                    }
                }
            }
            if (f) {
                out.println("<h1>Hello, " + name + ". Welcome back to my website....</h1>");
                out.println("<h1>Thank you</h1>");
            } else {
                out.println("<h1>You are a new user. Go to the home page and submit your name.</h1>");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
}
