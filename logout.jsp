<%-- 
    Document   : logout
    Created on : Apr 6, 2023, 10:03:12 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout JSP Page</title>
    </head>
    <body>
        <%  session.invalidate();
            response.sendRedirect("index.html");%>
    </body>
</html>
