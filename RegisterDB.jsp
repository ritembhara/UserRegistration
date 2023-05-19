<%-- 
    Document   : RegisterDB
    Created on : Apr 5, 2023, 4:13:27 PM
    Author     : Admin
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="register.html"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <!--<style>-->
<!--/*        .err
            {
                display: flex;
                justify-content: center;
                color:white;
                font-size:20px;
            }*/-->
        <!--</style>-->
    </head>
    <body>
        <%  
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sneha_jain");
                String uname=request.getParameter("un");
                String passd=request.getParameter("ps");
                String nm=request.getParameter("n");
                String add =request.getParameter("add");
                String pho =request.getParameter("pho");
                PreparedStatement ps=conn.prepareStatement("Insert into userDetails(Username,Password,Name,Address,Phone) values(?,?,?,?,?)");
                ps.setString(1,uname);
                ps.setString(2,passd);
                ps.setString(3,nm);
                ps.setString(4,add);
                ps.setString(5,pho);
                ps.executeUpdate();%>
                <div><%out.print("Data Inserted Successfully!");%></div>
                            <%}
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
                   
            %>
                      </body>
</html>
