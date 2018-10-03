/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignmentItem;
import java.io.Serializable;


/**
 *
 * @author ektasharma
 */
public class ItemDetails 
{
    private static final long serialVersionUID = 1L;
    private String itemNumber;
    private int quantity;
    private double priceEach;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String shippingAddress;
    private String payment;
    private String creditCardNumber;
    private String repeatCreditCardNumnber;

    public ItemDetails()
    {
        
    }

    public ItemDetails(String itemNumber, int quantity, double priceEach, String firstName, String lastName, String shippingAddress, String payment, String creditCardNumber, String repeatCreditCardNumnber) {
        setItemNumber(itemNumber);
        setQuantity(quantity);
        setPriceEach(priceEach);
        setFirstName(firstName);
        setLastName(lastName);
        setShippingAddress(shippingAddress);
        setPayment(payment);
        setCreditCardNumber(creditCardNumber);
        setRepeatCreditCardNumnber(repeatCreditCardNumnber);
    }
    
    

    public String getItemNumber() 
    {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber)throws NullPointerException 
    {
        if(itemNumber.equalsIgnoreCase("")|| itemNumber.equalsIgnoreCase(null))
        {
           throw new NullPointerException("Item number can't be null or empty ");

        }
        
        else
        {
        this.itemNumber = itemNumber;
        }
    }

    public int getQuantity() 
    {
        return quantity;
    }

    public void setQuantity(int quantity) throws ArithmeticException
    {
        
        if(quantity <= 0)
        {
           throw new ArithmeticException("Quantity can't be zero or negative ");

        }
        
        else 
        {
           this.quantity = quantity;

        }
    }

    public double getPriceEach() 
    {
        return priceEach;
    }

    public void setPriceEach(double priceEach) throws ArithmeticException 
    {
        if(priceEach <= 0) 
        {
            throw new ArithmeticException("Quantity can't be zero or negative ");

        }
        
        else 
        {
            this.priceEach = priceEach;

        }
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) throws NullPointerException
    {
        if(firstName.equalsIgnoreCase(null) || firstName.equalsIgnoreCase(""))
        {
            throw new NullPointerException("First name can't be null or empty");
        }
        else 
        {
           this.firstName = firstName;

        }
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) throws NullPointerException
    {
        if(lastName.equalsIgnoreCase(null) || lastName.equalsIgnoreCase(""))
        {
            throw new NullPointerException("Last name can't be null or empty");
        }
        
        else 
        {
            this.lastName = lastName;

        }
    }

    public String getMiddleInitial() 
    {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) 
    {
        this.middleInitial = middleInitial;
    }

    public String getShippingAddress() 
    {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) throws NullPointerException
    {
        if(shippingAddress.equalsIgnoreCase(null) || shippingAddress.equalsIgnoreCase(""))
        {
            throw new NullPointerException("Shipping address can't be zero or null");
        }
        
        else 
        {
            this.shippingAddress = shippingAddress;

        }
    }

    public String getCreditCardNumber() 
    {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) throws NullPointerException 
    {
        if(creditCardNumber.equalsIgnoreCase(null) || creditCardNumber.equalsIgnoreCase("") )
        {
            throw new NullPointerException("Credit card number field can't be empty or null");
        }
        
        else 
        {
            this.creditCardNumber = creditCardNumber;

        }
    }

    public String getRepeatCreditCardNumnber() 
    {
        return repeatCreditCardNumnber;
    }

    public void setRepeatCreditCardNumnber(String repeatCreditCardNumnber) throws NullPointerException 
    {
        if(repeatCreditCardNumnber.equalsIgnoreCase(null) || repeatCreditCardNumnber.equalsIgnoreCase("") )
        {
            throw new NullPointerException("repeat Credit card number field can't be empty or null");
        }
        else 
        {
        this.repeatCreditCardNumnber = repeatCreditCardNumnber;
        }
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
    
    
    
    
}
