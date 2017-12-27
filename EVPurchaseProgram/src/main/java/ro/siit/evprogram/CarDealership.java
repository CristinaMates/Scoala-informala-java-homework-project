package ro.siit.evprogram;

import java.util.ArrayList;

/**
 * @author Cristina Mates
 */

public class CarDealership {
    private String manufacturer;
    private boolean newCar = true;
    private int stock;
    private int price;
    private ArrayList<ElectricVehicle> electricVehicles;

    public CarDealership(String manufacturer, boolean newCar, int stock, int price) {
        this.manufacturer = manufacturer;
        this.newCar = newCar;
        this.stock = stock;
        this.price = price;
    }

    public boolean isNewCar() {
        return newCar;
    }

    public void setNewCar(boolean newCar) {
        this.newCar = newCar;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ArrayList<ElectricVehicle> getElectricVehicles() {
        return electricVehicles;
    }

    public void setElectricVehicles(ArrayList<ElectricVehicle> electricVehicles) {
        this.electricVehicles = electricVehicles;
    }


    public void requestBonus(int price){

        this.price = price;
    }

}
