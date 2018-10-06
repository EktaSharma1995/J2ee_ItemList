<%-- 
    Document   : ItemDetails
    Created on : 1-Oct-2018, 5:35:09 PM
    Author     : ektasharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form style = "background-color: oldlace; border: solid; padding: 1.5em; width: 50%" 
              action="InsertItems"  method="post">

            <h1>A Sample FORM using POST</h1>
            <h1><c:out value="${unhandledException}" /></h1>
            
            <label>Item Number:</label>
            <input type="text" name="itemnumber" maxlength="20">
            <div style="color: red;">
                <c:out value="${exceptionItemNumber}" /> 
            </div>
            <br/>
            
            <label>Quantity:</label>
            <input type="number" name="quantity" maxlength="20">
            <div style="color: red;">
                <c:out value="${exceptionQuantity}" />
            </div>
            <br/>
            
            <label>Price Each:</label>
            <input type="number" name="pe" step="any">
            <div style="color: red;">
                <c:out value="${exceptionPrice}" />
            </div>    
            <br/>

            <label>First name:</label>
            <input type="text" name="fname" maxlength="20">
            <div style="color: red;">
                <c:out value="${exceptionFirstName}" />
            </div>
            <br/>

            <label>Last name:</label>
            <input type="text" name="lname" maxlength="20">
            <div style="color: red;">
                <c:out value="${exceptionLastName}" />
            </div>        
            <br/> 

            <label>Middle Initial:</label>
            <input type="text" name="mname" maxlength="20">
            <br/> <br/>

            <label>Shipping Address:</label>
            <textarea rows="10" cols="50" name="sa"></textarea>
            <div style="color: red;">
                <c:out value="${exceptionAddress}" />    
            </div>    
            <br/>

            Credit Card: 
            <br/>
            <input type="radio" name="payment" value="Visa"> Visa <br/>
            <input type="radio" name="payment" value="Master Card"> Master Card <br/>
            <input type="radio" name="payment" value="American Express"> American Express <br/>
            <input type="radio" name="payment" value="Discover"> Discover <br/>
            <input type="radio" name="payment" value="Java SmartCard"> Java SmartCard <br/> 
            <br/>

            <label>Credit Card Number:</label> 
            <input type="password" name="ccnumber" maxlength="16">
            <div style="color: red;">
                <c:out value="${exceptionCreditCard}" />
            </div>    
            <br/>

            <label>Repeat Credit Card Number:</label>
            <input type="password" name="repeat" maxlength="16">
            <div style="color: red;">
                <c:out value="${exceptionConfirmCard}" />
            </div>    
            <br/>

            <input type="submit" value="Submit Order">
            </form>
    </body>
</html>
