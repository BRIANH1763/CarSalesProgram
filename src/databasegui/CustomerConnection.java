/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasegui;

import java.sql.*;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.Math;

/**
 *
 * @author MAR18146923
 */
public class CustomerConnection {

    private final String path = "D:\\P2 Car Sales ProjectV2\\Database1.accdb";
    private final String conStr = "jdbc:ucanaccess://" + path;
    private final String NAME = "net.ucanaccess.jdbc.UcanaccessDriver";

    //set a value for maximum number of customers in order to create an array of this size 
    private final int MAX_CUSTOMERS = 50;

    public int numRecordsInQuery = 0;

    private Connection connection = null;
    private PreparedStatement prepStatement = null;
    private ResultSet resultSet = null;

    public CustomerConnection() {
        try {
            // Connection to DB             
            Class.forName(NAME);
            connection = DriverManager.getConnection(conStr);
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            System.exit(1);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }

    public Customer[] getAllCustomers() {
        // instantiate an array of Student Objects to the MAX_STUDENTS size        
        Customer[] customersArray = new Customer[MAX_CUSTOMERS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT * FROM tblCustomers";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                int customerID = resultSet.getInt("CustomerID");
                String firstname = resultSet.getString("Firstname");
                String surname = resultSet.getString("Surname");
                String street = resultSet.getString("Street");
                String town = resultSet.getString("Town");
                String city = resultSet.getString("City");
                String postcode = resultSet.getString("Postcode");
                String contactNumber = resultSet.getString("ContactNumber");
                //instantiate a Student object with the data in the array                 
                customersArray[index] = new Customer(customerID, firstname, surname, street, town, city, postcode, contactNumber);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            close();
        }
        return customersArray;
    }

// close the connection
    public void close() {
        try {
            connection.close();
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
    }

    public Customer[] getCustomersByName(String surname) {
        // instantiate an array of Student Objects to the MAX_STUDENTS size        
        Customer[] customersArray = new Customer[MAX_CUSTOMERS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT * FROM tblCustomers WHERE Surname = ?";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //inserting the value in the parameter lName             
            //into the query string at the position of the first ?             
            prepStatement.setString(1, surname);

            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                int customerID = resultSet.getInt("CustomerID");
                String firstname = resultSet.getString("Firstname");
                String street = resultSet.getString("Street");
                String town = resultSet.getString("Town");
                String city = resultSet.getString("City");
                String postcode = resultSet.getString("Postcode");
                String contactNumber = resultSet.getString("ContactNumber");
                //instantiate a Student object with the data in the array                 
                customersArray[index] = new Customer(customerID, firstname, surname, street, town, city, postcode, contactNumber);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            close();
        }
        return customersArray;

    }

    public boolean addCustomer(String firstname, String surname, String street, String town, String city, String postcode, String contactNumber) {
        boolean done = false;
        try {
            //set up the SQL statement 
            String sqlString = "INSERT INTO tblCustomers ( Firstname, Surname, Street, Town, City, Postcode, ContactNumber ) VALUES( ?, ?, ?, ?, ?, ?, ? )";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values             
            prepStatement.setString(1, firstname);
            prepStatement.setString(2, surname);
            prepStatement.setString(3, street);
            prepStatement.setString(4, town);
            prepStatement.setString(5, city);
            prepStatement.setString(6, postcode);
            prepStatement.setString(7, contactNumber);

            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                done = true;
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return done;

    }

    public ArrayList getAllCars() {
        ArrayList carsList = new ArrayList();
        String strQuery = "SELECT * FROM tblCars";
        try {
            //create a prepared statement              
            prepStatement = connection.prepareStatement(strQuery);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             

            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                String CarID = resultSet.getString("CarID");
                String picPath = resultSet.getString("ImagePath");
                String Make = resultSet.getString("Make");
                String Model = resultSet.getString("Model");
                String Colour = resultSet.getString("Colour");
                String Year = resultSet.getString("Year");
                String EngineSize = resultSet.getString("EngineSize");
                String BodyType = resultSet.getString("BodyType");
                String Mileage = resultSet.getString("Mileage");
                String Transmission = resultSet.getString("Transmission");
                String FuelType = resultSet.getString("FuelType");
                String Condition = resultSet.getString("Condition");
                String Price = resultSet.getString("Price");

                double pri = Double.parseDouble(Price);
                pri = Math.round(pri);

                Price = Double.toString(pri);

                CarsClass temp = new CarsClass(CarID, picPath, Make, Model, Colour, Year, EngineSize, BodyType, Mileage, Transmission, FuelType, Condition, Price);
                carsList.add(temp);

            }

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            close();
        }
        return carsList;
    }

    public StaffClass[] getAllStaff() {
        // instantiate an array of Student Objects to the MAX_STUDENTS size        
        StaffClass[] StaffArray = new StaffClass[MAX_CUSTOMERS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT * FROM tblStaff";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                int StaffID = resultSet.getInt("StaffID");
                String firstname = resultSet.getString("Forename");
                String surname = resultSet.getString("Lastname");
                String street = resultSet.getString("Street");
                String town = resultSet.getString("Town");
                String city = resultSet.getString("City");
                String postcode = resultSet.getString("Postcode");
                String Mobile = resultSet.getString("Mobile");
                //instantiate a Student object with the data in the array                 
                StaffArray[index] = new StaffClass(StaffID, firstname, surname, street, town, city, postcode, Mobile);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            close();
        }
        return StaffArray;
    }

    public StaffClass[] getStaffbyName(String Surname) {
        // instantiate an array of Student Objects to the MAX_STUDENTS size        
        StaffClass[] StaffArray = new StaffClass[MAX_CUSTOMERS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT * FROM tblStaff WHERE Lastname = ?";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //inserting the value in the parameter lName             
            //into the query string at the position of the first ?             
            prepStatement.setString(1, Surname);

            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                int StaffID = resultSet.getInt("StaffID");
                String firstname = resultSet.getString("Forename");
                String street = resultSet.getString("Street");
                String town = resultSet.getString("Town");
                String city = resultSet.getString("City");
                String postcode = resultSet.getString("Postcode");
                String Mobile = resultSet.getString("Mobile");
                //instantiate a Student object with the data in the array                 
                StaffArray[index] = new StaffClass(StaffID, firstname, Surname, street, town, city, postcode, Mobile);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            close();
        }
        return StaffArray;

    }

    public ArrayList getAllOrders() {

        ArrayList ordersList = new ArrayList();
        String strQuery = "SELECT tblOrderDetails.OrderID, tblOrderDetails.CarID, tblOrder.StaffID,tblOrderDetails.Quantity,tblOrder.PaymentDate, tblOrder.CustomerID, tblCars.ImagePath, tblCars.Make, tblCars.Model, tblCars.Colour, tblCars.Year, tblCars.EngineSize, tblCars.BodyType, tblCars.Mileage, tblCars.Transmission, tblCars.FuelType, tblCars.Condition, tblCars.Price, tblCustomers.Firstname, tblCustomers.Surname, tblCustomers.Street, tblCustomers.Town, tblCustomers.City, tblCustomers.Postcode, tblCustomers.ContactNumber, tblStaff.Forename, tblStaff.Lastname\n"
                + "FROM tblStaff INNER JOIN (tblCustomers INNER JOIN (tblCars INNER JOIN (tblOrder INNER JOIN tblOrderDetails ON tblOrder.OrderID = tblOrderDetails.OrderID) ON tblCars.CarID = tblOrderDetails.CarID) ON tblCustomers.CustomerID = tblOrder.CustomerID) ON tblStaff.StaffID = tblOrder.StaffID;";
        try {
            prepStatement = connection.prepareStatement(strQuery);

            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();

            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item

                String StaffID = resultSet.getString("StaffID");
                String Forename = resultSet.getString("Forename");
                String Lastname = resultSet.getString("Lastname");
                String customerID = resultSet.getString("CustomerID");
                String firstname = resultSet.getString("Firstname");
                String surname = resultSet.getString("Surname");
                String street = resultSet.getString("Street");
                String town = resultSet.getString("Town");
                String city = resultSet.getString("City");
                String postcode = resultSet.getString("Postcode");
                String contactNumber = resultSet.getString("ContactNumber");
                String PaymentDate = resultSet.getString("PaymentDate");
                String Quantity = resultSet.getString("Quantity");
                String CarID = resultSet.getString("CarID");
                String picPath = resultSet.getString("ImagePath");
                String Make = resultSet.getString("Make");
                String Model = resultSet.getString("Model");
                String Colour = resultSet.getString("Colour");
                String Year = resultSet.getString("Year");
                String EngineSize = resultSet.getString("EngineSize");
                String BodyType = resultSet.getString("BodyType");
                String Mileage = resultSet.getString("Mileage");
                String Transmission = resultSet.getString("Transmission");
                String FuelType = resultSet.getString("FuelType");
                String Condition = resultSet.getString("Condition");
                String Price = resultSet.getString("Price");

                OrdersClass temp = new OrdersClass(StaffID, Forename, Lastname, customerID, firstname, surname, street, town, city, postcode, contactNumber, CarID, picPath, Make, Model, Colour, Year, EngineSize, BodyType, Mileage, Transmission, FuelType, Condition, Price, Quantity, PaymentDate);
                // OrdersClass temp = new OrdersClass(customerID, firstname, surname, street, town, city, postcode, contactNumber, StaffID,Forename, Lastname, CarID, picPath, Make, Model, Colour, Year, EngineSize, BodyType, Mileage, Transmission, FuelType, Condition, Price,PaymentDate,Quantity);
                ordersList.add(temp);

            }

        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            close();
        }
        return ordersList;
    }

    public boolean addStaff(String firstname, String Surname, String street, String town, String city, String postcode, String Mobile) {
        boolean done = false;
        try {
            //set up the SQL statement 
            String sqlString = "INSERT INTO tblStaff ( Forename, Lastname, Street, Town, City, Postcode, Mobile ) VALUES( ?, ?, ?, ?, ?, ?, ? )";
            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values             
            prepStatement.setString(1, firstname);
            prepStatement.setString(2, Surname);
            prepStatement.setString(3, street);
            prepStatement.setString(4, town);
            prepStatement.setString(5, city);
            prepStatement.setString(6, postcode);
            prepStatement.setString(7, Mobile);

            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                done = true;
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return done;
    }

    public Sales[] getAllSales() {
        // instantiate an array of Student Objects to the MAX_STUDENTS size        
        Sales[] Sales = new Sales[MAX_CUSTOMERS];
        //reset counter for number of records in the query        
        numRecordsInQuery = 0;
        try {
            //prepare the SQL statement             
            String sqlString = "SELECT tblOrderDetails.OrderID, tblOrderDetails.CarID, tblOrder.StaffID, tblOrder.CustomerID, tblOrderDetails.Quantity, tblOrder.PaymentDate\n"
                    + "FROM tblOrder INNER JOIN tblOrderDetails ON tblOrder.OrderID = tblOrderDetails.OrderID;";
            //create a prepared statement              
            prepStatement = connection.prepareStatement(sqlString);
            //execute the prepared statement and retrieve the results in the resultSet             
            resultSet = prepStatement.executeQuery();
            //extract the data from resultSet into the studentsArray             
            //parse through the resultSet extracting the data             
            int index = 0;
            while (resultSet.next()) {
                //extract id, firstName and lastName from current resultSet item                 
                int StaffID = resultSet.getInt("StaffID");
                int OrderID = resultSet.getInt("OrderID");
                int CustomerID = resultSet.getInt("CustomerID");
                int CarID = resultSet.getInt("CarID");
                int Quantity = resultSet.getInt("Quantity");
                String PaymentDate = resultSet.getString("PaymentDate");
                //instantiate a Student object with the data in the array                 
                Sales[index] = new Sales(StaffID, OrderID, CustomerID, CarID, Quantity, PaymentDate);
                index++;
            }
            //keep a record of the number of records in this query             
            numRecordsInQuery = index;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            close();
        }
        return Sales;
    }

    public boolean addOrder(String StaffID,String CustomerID,String PaymentDate,String CarID,String Quantity) {
        boolean Order = false;
        try {
            //set up the SQL statement 
            String sqlString = "INSERT INTO tblOrder ( StaffID, CustomerID, PaymentDate ) VALUES( ?, ?, ?)";

            //create prepared statement –              
            prepStatement = connection.prepareStatement(sqlString);
            // set the parameter values             

            prepStatement.setString(2, StaffID);
            prepStatement.setString(3, CustomerID);
            prepStatement.setString(4, PaymentDate);
            prepStatement.setString(5, CarID);
            prepStatement.setString(6, Quantity);

            // execute the prepared statement             
            int result = prepStatement.executeUpdate();
            //if the result is 1 then the record has been inserted successfully             
            if (result == 1) {
                Order = true;
            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        }
        return Order;
    }

}
