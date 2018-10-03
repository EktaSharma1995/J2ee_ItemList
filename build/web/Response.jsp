<%-- 
    Document   : Response
    Created on : 3-Oct-2018, 2:33:43 PM
    Author     : ektasharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.assignmentItem.ItemDetails"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
       ItemDetails items=(ItemDetails)request.getAttribute("id");
        %>
    <table align="center" bgcolor="#FFFFCC" border="1" width="70%">
        <tr>
            <td colspan="2" align="center"><%="Welcome "+items.getName()+" !!!!. Your selected subjects are:" %></td>
        </tr>
        <%
            String[] subjectsArray = payment.getSubjects();
            for(String s: subjectsArray){
            
        %>
        <tr>
            <td><%=s %> </td>
            
        </tr>
        <%
            }
        %>
    </table>    </body>
</html>
