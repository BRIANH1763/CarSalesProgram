/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasegui;

/**
 *
 * @author MAR18146923
 */
public class Customer {
//creating String based on each of the fields in the form
    private int customerID;
    private String firstname;
    private String surname;
    private String street;
    private String town;
    private String city;
    private String postcode;
    private String contactNumber;

    private static int numberOfCustomers = 0;

    //getters and setters for each of the fields
    public int getcustomerID() {
        return customerID;
    }

    public void setID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
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

    public Customer(int customerID, String firstname, String surname, String street, String town, String city, String postcode, String contactNumber) {
        this.customerID = customerID;
        this.firstname = firstname;
        this.surname = surname;
        this.street = street;
        this.town = town;
        this.city = city;
        this.postcode = postcode;
        this.contactNumber = contactNumber;
        numberOfCustomers++;
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers;
    }

}
