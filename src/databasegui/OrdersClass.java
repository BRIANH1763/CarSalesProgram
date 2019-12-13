/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasegui;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author b-hou
 */
public class OrdersClass {

    private String StaffID;
    private String Forename;
    private String Lastname;
    private String customerID;
    private String firstname;
    private String surname;
    private String street;
    private String town;
    private String city;
    private String postcode;
    private String contactNumber;
    private String CarID;
    private Image custPicture;
    private String path;
    private String Make;
    private String Model;
    private String Colour;
    private String Year;
    private String EngineSize;
    private String BodyType;
    private String Mileage;
    private String Transmission;
    private String FuelType;
    private String Condition;
    private String Price;
    private String PaymentDate;
    private String Quantity;


    private static int numberOfOrders = 0;

    public String getPaymentDate(){
        return PaymentDate; 
    }
    public void setPaymentDate(String PaymentDate){
        this.PaymentDate=PaymentDate;
    }
    public String getQuantity(){
        return Quantity;
    }
    public void setQuantity(String Quantity){
        this.Quantity=Quantity;
    }
    public String getStaffID() {
        return StaffID;
    }

    public void setstaffID(String StaffID) {
        this.StaffID = StaffID;
    }
    public String getForename(){
        return Forename;
    }
    public void setForename(String Forename) {
        this.Forename = Forename;
    }
    public String getLastname(){
        return Lastname;
    }
    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getcustomerID() {
        return customerID;
    }

    public void setID(String customerID) {
        this.customerID = customerID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getCarID() {
        return CarID;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public String getColour() {
        return Colour;
    }

    public String getYear() {
        return Year;
    }

    public String getEngineSize() {
        return EngineSize;
    }

    public String getBodyType() {
        return BodyType;
    }

    public String getMileage() {
        return Mileage;
    }

    public String getTransmission() {
        return Transmission;
    }

    public String getFuelType() {
        return FuelType;
    }

    public String getCondition() {
        return Condition;
    }

    public String getPrice() {
        return Price;
    }
    public String getPicPath(){
        return path;
    }
    public Image getImage(){
        return custPicture;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public void setEngineSize(String EngineSize) {
        this.EngineSize = EngineSize;
    }

    public void setBodyType(String BodyType) {
        this.BodyType = BodyType;
    }

    public void setMileage(String Mileage) {
        this.Mileage = Mileage;
    }

    public void setTransmission(String Transmission) {
        this.Transmission = Transmission;
    }

    public void setFuelType(String FuelType) {
        this.FuelType = FuelType;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }


    public OrdersClass(String StaffID,String Forename, String Lastname, String customerID, String firstname, String surname, String street, String town, String city, String postcode, String contactNumber,String CarID, String picPath, String Make, String Model, String Colour, String Year, String EngineSize, String BodyType, String Mileage, String Transmission, String FuelType, String Condition, String Price,String Quantity,String PaymentDate) {
     
        this.PaymentDate=PaymentDate;
        this.Quantity=Quantity;
        this.Forename = Forename;
        this.Lastname = Lastname;
        this.customerID = customerID;
        this.firstname = firstname;
        this.surname = surname;
        this.street = street;
        this.town = town;
        this.city = city;
        this.postcode = postcode;
        this.contactNumber = contactNumber;
        this.CarID = CarID;
        this.Make = Make;
        this.Model = Model;
        this.Colour = Colour;
        this.Year = Year;
        this.EngineSize = EngineSize;
        this.BodyType = BodyType;
        this.Mileage = Mileage;
        this.Transmission = Transmission;
        this.FuelType = FuelType;
        this.Condition = Condition;
        this.Price = Price;
        this.path = picPath;
        this.StaffID=StaffID;
        this.custPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource(picPath));
        numberOfOrders++;
    }

    public static int getnumberOfOrders() {
        return numberOfOrders;
    }

}
