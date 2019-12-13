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
public class CarsClass {
//creation of Strings for each of the fields in the form
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

    private static int numberOfCars = 0;
//getter and setters for obtaining the data in each field
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

    public CarsClass(String CarID, String picPath, String Make, String Model, String Colour, String Year, String EngineSize, String BodyType, String Mileage, String Transmission, String FuelType, String Condition, String Price) {
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
        this.custPicture = Toolkit.getDefaultToolkit().getImage(getClass().getResource(picPath));


        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }
}
