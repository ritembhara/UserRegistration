<%-- 
    Document   : newjsp
    Created on : Apr 6, 2023, 9:35:58 AM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=session.getId()%></h1>
         <h1><%=session.getCreationTime()%></h1>
    </body>
</html>
