package FirstServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class firstservlet1 implements Servlet 
{
	ServletConfig conf;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
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
		return ("This is SY bscit");
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.conf=conf;
		System.out.println("Creating the object");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("This is srevice Method");
		res.setContentType("TEXT/HTML");
		PrintWriter out= res.getWriter();
		out.println("<h1>This is My FirstServlet </h1>");
		out.println("<h1>Current Date & Time </h1>" +new Date().toString());
		
	}

}