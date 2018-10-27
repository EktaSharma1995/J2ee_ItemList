///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.assignmentItem;
//
//import com.assignmentItem.ItemDetails;
//import java.io.IOException;
//import java.io.PrintWriter;
//import static java.lang.System.out;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author ektasharma
// */
//@WebServlet(urlPatterns = {"/exception.controller"})
//
//public class InsertItems extends HttpServlet {
//
//    private static final long serialVersionUID = 1L;
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            /* TODO output your page here. You may use following sample code. */
//
//            ItemDetails items = new ItemDetails();
//            boolean exceptionOccurred = false;
//
//            try {
//                String itemNumber = request.getParameter("itemnumber");
//                items.setItemNumber(itemNumber);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionItemNumber", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            try {
//                int quantity = Integer.valueOf(request.getParameter("quantity"));
//                items.setQuantity(quantity);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionQuantity", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            try {
//                double priceEach = Double.valueOf(request.getParameter("pe"));
//                items.setPriceEach(priceEach);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionPrice", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            try {
//                String firstName = request.getParameter("fname");
//                items.setFirstName(firstName);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionFirstName", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            try {
//                String lastName = request.getParameter("lname");
//                items.setLastName(lastName);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionLastName", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            String middleInitial = request.getParameter("mname");
//            items.setMiddleInitial(middleInitial);
//
//            try {
//                String shippingAddress = request.getParameter("sa");
//                items.setShippingAddress(shippingAddress);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionAddress", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            try {
//                String paymentMode = request.getParameter("payment");
//                items.setPayment(paymentMode);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionPayment", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            try {
//                String creditCardNumber = request.getParameter("ccnumber");
//                items.setCreditCardNumber(creditCardNumber);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionCreditCard", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            try {
//                String repeatCreditCardNumber = request.getParameter("repeat");
//                items.setRepeatCreditCardNumnber(repeatCreditCardNumber);
//            } catch (Exception ex) {
//                request.setAttribute("exceptionConfirmCard", ex.getMessage());
//                exceptionOccurred = true;
//            }
//
//            if (!items.getCreditCardNumber().equalsIgnoreCase(items.getRepeatCreditCardNumnber())) {
//                exceptionOccurred = true;
//                request.setAttribute("exceptionSameCardNumbers", "Card number do not match");
//            }
//
//            if (exceptionOccurred) {
//                RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ItemDetails.jsp");
//                requestDispatcher.forward(request, response);
//            } else {
//                
////                try{
////                
////                Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
////                
////                Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
////
////                String query = "insert into user values(?,?,?,?,?,?,?))";
////                
////                PreparedStatement ps = connect.prepareStatement(query); // generates sql query
////
////                System.out.println("querry run");
////                
//////                ps.setString(1, name);
//////                ps.setString(2, dob);
////
////                
////                }
//                RequestDispatcher dispatcher = request.getRequestDispatcher("/Response.jsp");
//                request.setAttribute("id", items);
//                dispatcher.forward(request, response);
//            }
//
//        } catch (Exception e) {
//            request.setAttribute("unhandledException", e.getMessage());
//            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ItemDetails.jsp");
//            requestDispatcher.forward(request, response);
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
