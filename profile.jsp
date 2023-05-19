<%-- 
    Document   : profile
    Created on : Apr 5, 2023, 10:20:06 AM
    Author     : student
--%>
<%@ page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("Name")!=null)
   {%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Page</title>
         <style>
            *
            {
                border-sizing:border-box;
            }
            body
            {
                   background-image:url('Images/p2.jpg');
                background-repeat: no-repeat;
                background-size: cover;
            }
            h1
            {
                color:darkblue;
            }
            .container
            {
                display:flex;
                flex-direction:column;
                border: solid 2px darkblue;
                width:50%;
                margin-left: 22%;
                margin-top:15%;
                background-color: white;
                padding:30px;
                border-radius:15px;
            }
            .name
            {
                display:flex;
                justify-content: center;
                align-items: center;
                font-family: 'Times New Roman', Times, serif;
                font-weight: bold;
                font-variant: small-caps;
                font-size: 40px;
            }
            .info
            {
                display:flex;
                flex-direction:column;
                justify-content:center;
                align-items: center;
                font-family: 'Times New Roman', Times, serif;
                font-size: 20px;
                line-height: 1px;
                background-color:#b3e6fd;
                padding:5px;
                width:40%;
                margin-left: 30%;
                border:solid 1px darkblue;
            }
             button 
            {
                font-family: 'Times New Roman', Times, serif;
                font-weight: bold;
                font-variant: small-caps;
                background-color:darkblue;  
                color: white;  
                padding: 16px 20px;  
                border: none;  
                cursor: pointer;  
                width:100%;  
                opacity: 0.9; 
                font-size:20px;
                border-radius:2px;
            }
            button:hover
            {
                transform:scale(1.1);
                transition:2s;
            }
          </style>
    </head>
    <body>
                <div class="container">
                    <div class="name">
                        <%out.print(session.getAttribute("Name"));%> 
<!--                        <-- setAttribute() gives an object-->
                    </div><br>
                    <div class="info">
                        <p>Address: <%out.print(session.getAttribute("Address"));%></p>
                        <p>Phone No.: <%out.print(session.getAttribute("Phone"));%></p>
                    </div>
                </div><br>
                    <div style="display:flex;align-items:center;justify-content: center;"><a href="logout.jsp"><button>Logout</button></a></div>
    </body>
</html>
<% } 
    else
        response.sendRedirect("index.html");%>