package first;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.*;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet1 implements Servlet{
	ServletConfig conf;
	@Override
	public void destroy() {
		System.out.println("Destroying the object");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return conf;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this is sybscit ";
	}

	@Override
	public void init(ServletConfig conf) throws ServletException {
		System.out.println("This is service method");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("This is service Method");
		response.setContentType("TEXT/HTML");
		PrintWriter out = response.getWriter();
		out.println("<h1>This is my FirstServlet</h1>");
		out.println("<h1>Current Date & Time </h1>"+new Date(0).toString());
		
	}

}
