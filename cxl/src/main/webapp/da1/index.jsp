<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

首页
<br>
<a href="<%= request.getContextPath() %>/da1/hello.jsp">hello</a>

<br/>
<br/>
<a href="<%= request.getContextPath()%>/da1/hello.jsp"></a>
<% 
String flag="";
Object obj=session.getAttribute("falg");
if(obj!=null)
{
	flag=obj.toString();	
}
if(flag.equals("login_success")){
	%>
	<a href="<%= request.getContextPath() %>/checkServlet">退出</a>
	<% } else{%>
	<a href="<%= request.getContextPath() %>/da1/login.jsp">登录</a>
       <%} %> 

</body>
</html>