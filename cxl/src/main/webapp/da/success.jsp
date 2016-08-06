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
登陆成功！！！
<form action="<%=request.getContextPath() %>/chakan" method="post">
<table border="1" cellpadding="5" cellspacing="0" background="blue" align="center">

<tr>
<td colspan="2" align="center">
<input type="submit" value="查看film信息" onclick="return check(this);"/>
</td>
</tr>
</table>
</form>

</body>
</html>