<%@ page  contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html><head>
            <meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
            <title>First JSP Page</title>
       </head>
       <body style="background-color: pink">
             <h1>First JS page</h1>
<%! 
    int a = 50;
    int b = 10;
    String name ="welcome to JSP";
    
    public int doSum()
    {
    	return a+b;
    	
    }
    
    public String reverse()
    {
    	StringBuffer br = new StringBuffer(name);
    	return br.reverse().toString();
    }




%>
<%
  out.println("a ="+a);
  out.println("<br>");
  out.println("b ="+b); 
  out.println("Sum ="+doSum()); 
  out.println("<br>"); 
  out.println("Reversse of Welcome to JSP = "+reverse()); 
  
  %>
   <h1 style="color:red;">Sum is: <%= doSum() %></h1>
   <h1><%=a %></h1>
   
   <%=name %>

</body>
</html>