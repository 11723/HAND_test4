<%@ page import="entities.Film" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>FirstJSP</title>
</head>
<body>
    <table align="center" border="1px" cellpadding="5px"  cellspacing="0px" width="80%" text-align="left" >
        <tr>
            <th>标题</th>
            <th>描述</th>
            <th>上映日期</th>
            <th>放映语言</th>
            <th>原始语言</th>
            <th>rental_duration</th>
            <th>rental_rate</th>
            <th>时长</th>
            <th>replacement_cost</th>
            <th>级别</th>
            <th>特征</th>
            <th>上次更新时间</th>
        </tr>

<%
     List<Film> lists = (List<Film>) request.getAttribute("lists");
    
    for (Film film : lists){
%>
             <tr>
            <td><%=film.getTitle() %></td>
            <td><%=film.getDescription() %></td>
            <td><%=film.getYear() %></td>
            <td><%=film.getLanguage_id() %></td>
            <td><%=film.getOriginal_language_id() %></td>
            <td><%=film.getRental_duration() %></td>
            <td><%=film.getRental_rate() %></td>
            <td><%=film.getLength() %></td>
            <td><%=film.getReplacement_cost() %></td>
            <td><%=film.getRating()%></td>
            <td><%=film.getSpecial_features() %></td>
            <td><%=film.getLast_update()%></td>
        </tr>

        <%
            }
        %>

        </table>
</body>
</html>
