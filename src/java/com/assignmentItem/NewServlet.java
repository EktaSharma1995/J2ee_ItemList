/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignmentItem;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ektasharma
 */
@WebServlet(urlPatterns = {"/exception.controller"})

public class NewServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private int quantity;
    private double priceEach;
//    private String itemNumber, firstName, lastName, middleInitial, shippingAddress, paymentMode, creditCardNumber, repeatCreditCardNumber;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            /* TODO output your page here. You may use following sample code. */
            String validationMsg = "";
            boolean validationFailed = false;
            
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

            
            if (itemNumber.isEmpty()) {
                validationFailed = true;
                validationMsg = "Item number is empty";
                request.setAttribute("exceptionItemNumber", validationMsg);

            } 
            
            try {
                quantity = Integer.valueOf(request.getParameter("quantity"));
            } catch (Exception ex) {
                request.setAttribute("exceptionQuantity", "invalid quantity");
                validationFailed = true;
            }
                        
            try {
                priceEach = Double.valueOf(request.getParameter("pe"));
            } catch (Exception ex) {
                request.setAttribute("exceptionPrice", "invalid price");
                validationFailed = true;
            }
            
            if (firstName.isEmpty()) {
                validationFailed = true;
                validationMsg = "First name is empty";
                request.setAttribute("exceptionFirstName", validationMsg);

            } 
            
            if (lastName.isEmpty()) {
                validationFailed = true;
                validationMsg = "Last name is empty";
                request.setAttribute("exceptionLastName", validationMsg);

            } 
            
            if (shippingAddress.isEmpty()) {
                validationFailed = true;
                validationMsg = "Shipping Address is empty";
                request.setAttribute("exceptionAddress", validationMsg);
    
            } 
            
            if (creditCardNumber.isEmpty()) {
                validationFailed = true;
                validationMsg = "Credit card is empty";
                request.setAttribute("exceptionCreditCard", validationMsg);
                
            } 
            
            if (repeatCreditCardNumber.isEmpty()) {
                validationFailed = true;
                validationMsg = "Repeat credit card is empty";
                request.setAttribute("exceptionConfirmCard", validationMsg);
                
            } 
            
            
            if (!creditCardNumber.equalsIgnoreCase(repeatCreditCardNumber)) {
                validationFailed = true;
                request.setAttribute("exceptionCardDoNotMatch", "Card number do not match");
            }

            if (validationFailed) {
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("ItemDetails.jsp");
//                request.setAttribute("unhandledException", validationMsg);
                requestDispatcher.forward(request, response);
            } 
            
            else {
            
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();

            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");

            String query = "insert into item values(?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = connect.prepareStatement(query); // generates sql query

            System.out.println("querry run");

            ps.setString(1, itemNumber);
            ps.setInt(2, quantity);
            ps.setDouble(3, priceEach);
            ps.setString(4, firstName);
            ps.setString(5, lastName);
            ps.setString(6, middleInitial);
            ps.setString(7, shippingAddress);
            ps.setString(8, paymentMode);
            ps.setString(9, creditCardNumber);
            ps.setString(10, repeatCreditCardNumber);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("Response.jsp");
            dispatcher.forward(request, response);    
            
            ps.executeUpdate(); // execute it on test database
            System.out.println("successfuly inserted");
//                connect.commit();
            ps.close();
            connect.close();

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            Logger.getLogger(NewServlet.class.getName()).log(Level.SEVERE, null, ex);

        }
//                RequestDispatcher dispatcher = request.getRequestDispatcher("/Response.jsp");
//                dispatcher.forward(request, response);
    }

}

/**
 * Returns a short description of the servlet.
 *
 * @return a String containing servlet description
 */
