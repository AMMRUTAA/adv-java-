package httpspost;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class httpspost extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html");
		out.println("< html>");
		out.println("< head>");
		out.println("< body>");
		out.println("<h4>Hello "+req.getParameter("tName") +",Welcome to the world of java Dev!<h4>");
		out.println("< body>");
		out.println("< html>");

	}
}
