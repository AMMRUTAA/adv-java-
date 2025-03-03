<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>First JSP Page</title>
</head>
<body style="background-color: pink">
    <h1>First JSP Page</h1>

<%!
    // Declaring variables that can be used anywhere on this page
    int a = 50; // A number variable with value 50
    int b = 10; // Another number variable with value 10
    String name = "Welcome to JSP"; // A string variable

    // A function (method) to add two numbers and return the result
    public int doSum() {
        return a + b; // Adds 'a' and 'b' and gives back the result
    }

    // A function to reverse the text stored in 'name' and return it
    public String reverse() {
        StringBuffer br = new StringBuffer(name); // Converts the string to a modifiable format
        return br.reverse().toString(); // Reverses the text and returns it
    }
%>

<%
    // Printing values directly in the HTML page using JSP
    out.println("Value of a = " + a); // Displays the value of 'a'
    out.println("<br>"); // Adds a line break
    out.println("Value of b = " + b); // Displays the value of 'b'
    out.println("<br>");
    out.println("Sum of a and b = " + doSum()); // Displays the sum of 'a' and 'b'
    out.println("<br>");
    out.println("Reversed text: " + reverse()); // Displays the reversed version of 'name'
%>

<!-- Displaying values in the page using JSP expressions (shorter and cleaner way) -->
<h1 style="color:red;">Sum is: <%= doSum() %></h1> <!-- Shows the sum in a red heading -->
<h1>Value of a: <%= a %></h1> <!-- Displays the value of 'a' -->
<p>Original text: <%= name %></p> <!-- Shows the original string value -->

</body>
</html>
