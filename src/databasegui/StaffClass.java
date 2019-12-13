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
public class StaffClass {
    private int staffID;
    private String firstname;
    private String surname;
    private String street;
    private String town;
    private String city;
    private String postcode;
    private String mobileNumber;
    
    private static int numberOfStaff=0;


    public int getstaffID() {
        return staffID;
    }

    public void setID(int staffID) {
        this.staffID = staffID;
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
    
    
    
    
    
    
    public String getmobileNumber() {
        return mobileNumber;
    }

    public void setmobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }




public StaffClass(int staffID, String firstname, String surname, String street, String town, String city, String postcode, String mobileNumber) {
         this.staffID = staffID;
         this.firstname = firstname;
         this.surname = surname;
         this.street = street;
         this.town = town;
         this.city = city;
         this.postcode = postcode;
         this.mobileNumber = mobileNumber;
         numberOfStaff++;
    }
    
    public static int getNumberOfStaff(){
        return numberOfStaff;
    }

}


