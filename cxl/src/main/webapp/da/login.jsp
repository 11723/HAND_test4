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
</style>
<script type="text/javascript">
function check(form) {
	if(document.forms.loginForm.username.value="")
		{
		alert("请输入账号！");
		document.forms.loginForm.username.focus();
		
		}
	if(document.forms.loginForm.password.value="")
	{
	alert("请输入密码！");
	document.forms.loginForm.password.focus();
	
	}
	
}



</script>
</head>
<body>
<form action="<%=request.getContextPath() %>/checkServlet" method="post">
<table border="1" cellpadding="5" cellspacing="0" background="blue" align="center">
<tr>
<td colspan="2" align="center" bgcolor="yellow">用户登录</td>
</tr>
<tr>
<td>用户名：</td>
<td><input type="text" name="username"/> </td>
</tr>
<tr>
<td>密码：</td>
<td><input type="password" name="password"/> </td>
</tr>	
<tr>
<td colspan="2" align="center">
<input type="submit" name="submit" onclick="return check(this);"/>
</td>
</tr>
</table>
</form>
</body>
</html>