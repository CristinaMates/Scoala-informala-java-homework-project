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
    private GreenBonusProgram gbprogram;
    ElectricVehicle[] ev = new ElectricVehicle[9];

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

    /**
     * Created method in order to filter the array based on the fast-charging criteria
     *
     * @param elv
     * @return
     */

    public ElectricVehicle[] filterFastCharging(ElectricVehicle[] elv) {
        for (int i = 0; i < elv.length; i++) {
            if (elv[i].isFastCharging() == true) {
                System.out.println("Fast-charging cars: " + elv[i]);
            }
        }
        return elv;
    }

    /**
     * Created method in order to filter the array based on the stock criteria
     *
     * @param elecv
     * @return
     */

    public ElectricVehicle[] filterStock(ElectricVehicle[] elecv) {
        for (int i = 0; i < elecv.length; i++) {
            if (elecv[i].getStock() > 0) {
                System.out.println("Cars in stock: " + elecv[i]);
            }
        }
        return elecv;
    }

    public int getFullPrice(ArrayList<ElectricVehicle> vehicle) {
        int fullPrice = 0;
        for (int a = 0; a <= vehicle.size() - 1; a++) {
            fullPrice = vehicle.get(a).getPrice();
        }
        return fullPrice;
    }

    /**
     * Method for calculating the price after using the discount
     *
     * @param e
     * @return
     */

    public int getDiscountedPrice(ArrayList<ElectricVehicle> e) {
        GreenBonusProgram gbp = new GreenBonusProgram();
        int newPrice = 0;
        for (ElectricVehicle elevehicle : e) {
            if (gbp.getTotalSum() > 10000) {
                newPrice = elevehicle.getPrice() - gbp.getFixedBudget();
            }
        }
            return newPrice;
    }

    /**
     * Method for throwing an exception if the car is out of stock.
     */
    public void carsStock(ArrayList<ElectricVehicle> ele) throws IllegalArgumentException {
        for (int i = 0; i < ele.size(); i++) {
            if ((ele.get(i).getStock() <= 0)) {
                throw new IllegalArgumentException("The car should be in stock in order to purchase it.");
            }
        }
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

    public void requestBonus(int price) {

        this.price = price;
    }

}

