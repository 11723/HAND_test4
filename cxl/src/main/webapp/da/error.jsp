<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
	color:#000;
	font-size: 14px;
	margin: 20px auto;
	
}
#message{
text-align: center;
}
</style>
</head>


<body>
<div id="message">
sorry
<%
Object obj=request.getAttribute("msg");
if(obj!=null)
{
		out.println(obj.toString())	;
}
else{
	out.println("空");
}

%>
登录失败
</div>
</body>
</html>