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
       ItemDetails items=(ItemDetails)request.getAttribute("id");
        %>
    <table align="center" bgcolor="#FFFFCC" border="1" width="70%">
        <tr>
            <td colspan="0.5" align="center" bgcolor="orange"><%="Parameter Name" %></td>
            <td colspan="0.5" align="center" bgcolor="orange"><%="Parameter Value(s)" %></td>

        </tr>
        
        <tr>
            <td colspan="0.5" align="center"><%="Address "%></td>
            <td colspan="0.5" align="center"><%="" +items.getShippingAddress()+ ""%></td>
            <br/>
        </tr>
        
        <tr>
            <td colspan="0.5" align="center"><%="Initial "%></td>
            <td colspan="0.5" align="center"><%="" +items.getMiddleInitial()+ ""%></td>
            <br/>
        </tr>    
        
        <tr>
            <td colspan="0.5" align="center"><%="Price "%></td>
            <td colspan="0.5" align="center"><%="" +items.getPriceEach()+ ""%></td>
            <br/>
        </tr>    
        
        <tr>
            <td colspan="0.5" align="center"><%="Card Number "%></td>
            <td colspan="0.5" align="center"><%="" +items.getCreditCardNumber()+ ""%></td>
            <br/>
        </tr>    
            
        <tr>
            <td colspan="0.5" align="center"><%="First Name "%></td>
            <td colspan="0.5" align="center"><%="" +items.getFirstName()+ ""%></td>
            <br/>
        </tr> 
        
        <tr>
            <td colspan="0.5" align="center"><%="Item Number "%></td>
            <td colspan="0.5" align="center"><%="" +items.getItemNumber()+ ""%></td>
            <br/>
        </tr>  
        
        <tr>
            <td colspan="0.5" align="center"><%="Card Type "%></td>
            <td colspan="0.5" align="center"><%="" +items.getPayment()+ ""%></td>
            <br/>
        </tr>    
        
        <tr>
            <td colspan="0.5" align="center"><%="Quantity "%></td>
            <td colspan="0.5" align="center"><%="" +items.getQuantity()+ ""%></td>
            <br/>
        </tr> 
        
        <tr>
            <td colspan="0.5" align="center"><%="Last Name "%></td>
            <td colspan="0.5" align="center"><%="" +items.getLastName()+ ""%></td>
            <br/>
        </tr>
    </table>    
    </body>
</html>
