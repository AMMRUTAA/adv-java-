<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Random"%>
<%@ page isErrorPage="true"%> 
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>First JSP</title>
<style>
* {
    margin: 0px;
    padding: 0px;
}
</style>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>Random Number:
<% 
Random r = new Random();
int n = r.nextInt(10);
%>
<%= n %>
</h1>
</body>
</html>

