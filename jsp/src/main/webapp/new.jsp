<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Meta tag to define the character encoding -->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>First JSP Page</title>
</head>
<body style="background-color: pink">
    <h1>First JSP Page</h1>

<%!
    // Declaring instance variables
    int a = 50;
    int b = 10;
    String name = "Welcome to JSP";

    // Method to calculate the sum of 'a' and 'b'
    public int doSum() {
        return a + b;
    }

    // Method to reverse the string 'name'
    public String reverse() {
        StringBuffer br = new StringBuffer(name);
        return br.reverse().toString();
    }
%>

<%
    // Displaying values using scriptlet
    out.println("a = " + a);
    out.println("<br>");
    out.println("b = " + b);
    out.println("<br>");
    out.println("Sum = " + doSum());
    out.println("<br>");
    out.println("Reverse of 'Welcome to JSP' = " + reverse());
%>

<!-- Displaying results using JSP Expression Language -->
<h1 style="color:red;">Sum is: <%= doSum() %></h1>
<h1><%= a %></h1>
<%= name %>

</body>
</html>
