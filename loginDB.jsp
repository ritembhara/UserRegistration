<%-- 
    Document   : loginDB
    Created on : Apr 5, 2023, 9:46:11 AM
    Author     : student
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="index.html"%>
<%--we can even use a directive <%@page session="false"%> we can even --%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .err
            {
                display: flex;
                justify-content: center;
                color:white;
                font-size:20px;
            }
        </style>
    </head>
    <body>
<!--        <h1><%=session.getId()%></h1>
        <h1><%=session.getCreationTime()%></h1>-->
            <%
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sneha_jain");
                String uname=request.getParameter("userName");
                String passd=request.getParameter("pass");
                PreparedStatement ps=conn.prepareStatement("Select *from userDetails where Username=? and Password=?");
                ps.setString(1,uname);
                ps.setString(2,passd);
                ResultSet rs=ps.executeQuery();
                try
                {
                    if(rs.next())
                    {
                            session=request.getSession(false);
                            String name=rs.getString(3);
                            String add=rs.getString(4);
                            String pho=rs.getString(5);
                            session.setAttribute("Name",name);
                            session.setAttribute("Address",add);
                            session.setAttribute("Phone",pho);
                            response.sendRedirect("profile.jsp");
                    }
                    else
                    {%>
                        
                    <div class="err"><%out.print("Invalid Username or Password");%></div>
                    <% }
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
                   
            %>
    </body>
</html>
