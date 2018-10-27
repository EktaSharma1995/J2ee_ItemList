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
        <h1>Reading All Request Parameters</h1>
        <%
            String itemNumber = request.getParameter("itemnumber");
            int quantity = Integer.valueOf(request.getParameter("quantity"));
            double priceEach = Double.valueOf(request.getParameter("pe"));
            String firstName = request.getParameter("fname");
            String lastName = request.getParameter("lname");
            String middleInitial = request.getParameter("mname");
            String shippingAddress = request.getParameter("sa");   
            String paymentMode = request.getParameter("payment");
            String creditCardNumber = request.getParameter("ccnumber");
            String repeatCreditCardNumber = request.getParameter("repeat");
        %>
    <table align="center" bgcolor="#FFFFCC" border="1" width="70%">
        <tr>
            <td colspan="0.5" align="center" bgcolor="orange"><%="Parameter Name" %></td>
            <td colspan="0.5" align="center" bgcolor="orange"><%="Parameter Value(s)" %></td>

        </tr>
        
        <tr>
            <td colspan="0.5" align="center"><%="Item# "%></td>
            <td colspan="0.5" align="center"><%=itemNumber%></td>
            <br/>
        </tr>
        
        <tr>
            <td colspan="0.5" align="center"><%="Quantity "%></td>
            <td colspan="0.5" align="center"><%=quantity%></td>
            <br/>
        </tr>    
        
        <tr>
            <td colspan="0.5" align="center"><%="Price Each "%></td>
            <td colspan="0.5" align="center"><%=priceEach%></td>
            <br/>
        </tr>    
        
                    
        <tr>
            <td colspan="0.5" align="center"><%="First Name "%></td>
            <td colspan="0.5" align="center"><%=firstName+ ""%></td>
            <br/>
        </tr> 
        
        <tr>
            <td colspan="0.5" align="center"><%="Last Name "%></td>
            <td colspan="0.5" align="center"><%=lastName%></td>
            <br/>
        </tr>
        
        <tr>
            <td colspan="0.5" align="center"><%="Middle Initial "%></td>
            <td colspan="0.5" align="center"><%=middleInitial%></td>
            <br/>
        </tr>
        
        <tr>
            <td colspan="0.5" align="center"><%="Shipping Address "%></td>
            <td colspan="0.5" align="center"><%=shippingAddress%></td>
            <br/>
        </tr>
        
        <tr>
            <td colspan="0.5" align="center"><%="Credit Card"%></td>
            <td colspan="0.5" align="center"><%=paymentMode%></td>
            <br/>
        </tr>    

        
        <tr>
            <td colspan="0.5" align="center"><%="Credit Card Number "%></td>
            <td colspan="0.5" align="center"><%=creditCardNumber%></td>
            <br/>
        </tr>  
        
        <tr>
            <td colspan="0.5" align="center"><%="Repeat Credit Card Number  "%></td>
            <td colspan="0.5" align="center"><%=repeatCreditCardNumber%></td>
            <br/>
        </tr> 
        
        
    </table>   
    </body>
</html>
