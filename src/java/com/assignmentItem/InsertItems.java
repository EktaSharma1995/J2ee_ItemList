/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignmentItem;

import com.assignmentItem.ItemDetails;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ektasharma
 */
public class InsertItems extends HttpServlet {
        private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            /* TODO output your page here. You may use following sample code. */
            
            ItemDetails items = new ItemDetails();

            String itemNumber = request.getParameter("itemnumber");
            items.setItemNumber(itemNumber);

            int quantity = Integer.valueOf(request.getParameter("quantity"));
            items.setQuantity(quantity);

            double priceEach = Double.valueOf(request.getParameter("pe"));
            items.setPriceEach(priceEach);

            String firstName = request.getParameter("fname");
            items.setFirstName(firstName);

            String lastName = request.getParameter("lname");
            items.setLastName(lastName);

            String middleInitial = request.getParameter("mname");
            items.setMiddleInitial(middleInitial);

            String shippingAddress = request.getParameter("sa");
            items.setShippingAddress(shippingAddress);
  
            String paymentMode = request.getParameter("payment");
            items.setPayment(paymentMode);

            String creditCardNumber = request.getParameter("ccnumber");
            items.setCreditCardNumber(creditCardNumber);

            String repeatCreditCardNumber = request.getParameter("repeat");
            items.setRepeatCreditCardNumnber(repeatCreditCardNumber);
            
            RequestDispatcher dispatcher=request.getRequestDispatcher("/Response.jsp");

            request.setAttribute("id",items);
            dispatcher.forward(request, response);
        }   catch (ServletException e) {
            e.printStackTrace();
        }   catch (IOException e) {
            e.printStackTrace();
        }   catch(Exception e){
            e.printStackTrace();
        }   
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
