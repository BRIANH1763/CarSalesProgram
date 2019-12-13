/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasegui;

/**
 *
 * @author b-hou
 */
public class Sales {
    private int OrderID;
    private int CarID;
    private int CustomerID;
    private int StaffID;
    private int Quantity;
    private String PaymentDate;
    
     private static int numberOfSales = 0;
    
    public int getOrderID(){
    return OrderID;
}
    public int getCarID(){
        return CarID;
    }
    public int getCustomerID(){
        return CustomerID;
    }
    public int getStaffID(){
        return StaffID;
    }
    public int getQuantity(){
        return Quantity;
    }
    public String getPaymentDate(){
        return PaymentDate;
    }
    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }
      public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }
       public void setCarID(int CarID) {
        this.CarID = CarID;
    }
        public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }
         public void setQuantityID(int Quantity) {
        this.Quantity = Quantity;
    }
          public void setPaymentDateID(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }
    
    
    public Sales(int OrderID, int CarID,int CustomerID, int StaffID, int Quantity, String PaymentDate){
        this.OrderID=OrderID;
        this.CarID=CarID;
        this.CustomerID=CustomerID;
        this.StaffID=StaffID;
        this.Quantity=Quantity;
        this.PaymentDate=PaymentDate;
        
        numberOfSales++;
    }
    public static int numberOfSales(){
        return numberOfSales;
    }
    
}
    

