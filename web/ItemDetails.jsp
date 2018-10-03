<%-- 
    Document   : ItemDetails
    Created on : 1-Oct-2018, 5:35:09 PM
    Author     : ektasharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body border-style = "solid" border="1">
        <form action="InsertDetails" method="post">

            <h1>A Sample FORM using POST</h1>

            Item Number:
            <input type="text" name="itemnumber" maxlength="20">
            <br/> <br/>

            Quantity:
            <input type="number" name="quantity" maxlength="20">
            <br/> <br/>

            Price Each:
            <input type="number" name="pe" step="any">
            <br/> <br/>

            First name:
            <input type="text" name="fname" maxlength="20">
            <br/> <br/>

            Last name:
            <input type="text" name="lname" maxlength="20">
            <br/> <br/>

            Middle Initial:
            <input type="text" name="mname" maxlength="20">
            <br/> <br/>

            Shipping Address:
            <textarea rows="10" cols="50" name="sd"></textarea>
            <br/> <br/>

            Credit Card: 
            <br/>
            <input type="radio" name="payment" value="Visa"> Visa <br/>
            <input type="radio" name="payment" value="Master Card"> Master Card <br/>
            <input type="radio" name="payment" value="American Express"> American Express <br/>
            <input type="radio" name="payment" value="Discover"> Discover <br/>
            <input type="radio" name="payment" value="Java SmartCard"> Java SmartCard <br/> 
            <br/>

            Credit Card Number: 
            <input type="password" name="ccnumber" maxlength="16">
            <br/> <br/>

            Repeat Credit Card Number:
            <input type="password" name="repeat" maxlength="16">
            <br/> <br/>

            <input type="submit" value="Submit Order">
            </form>
    </body>
</html>
