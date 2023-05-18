<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <%@include file="Link.jsp"%>
</head>
<body>
<%@include file="menu.jsp"%>
<div class = "container">
    <div class = "row">
        <div class = "col-6">
<h1><%= "You Are welcome!" %>
</h1>
<br/> <ul> <li> <a href="hello-servlet">Hello Servlet</a></li></ul>
        </div>
    </div>
</div>

</body>

</html>