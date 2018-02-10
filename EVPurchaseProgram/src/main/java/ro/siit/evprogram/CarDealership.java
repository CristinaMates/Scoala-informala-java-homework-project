package ro.siit.evprogram;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Cristina Mates
 */

public class CarDealership implements Runnable {
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

    public void requestBonus(ArrayList<ElectricVehicle> eVehicles) {
        int request = 0;
        for (int i = 0; i < eVehicles.size(); i++) {
            if (eVehicles.get(i).getStock() > 0) {
                request += 1;
            }
        }
        System.out.println("Request bonus from Green Bonus Program" + request);
    }

    public void run() {

        ElectricVehicle[] evRequest = new ElectricVehicle[9];
        evRequest[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, 10, 25000);
        evRequest[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 18, 38000);
        evRequest[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 5, 33000);
        evRequest[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, 9, 40000);
        evRequest[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, 21, 22000);
        evRequest[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700);
        evRequest[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 25, 23000);
        evRequest[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 12, 34000);
        evRequest[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 27000);

        Random rand = new Random();
        int numberOfRequest = 0;
        for (int y = 0; y <= evRequest.length - 1; y++) {
            while (evRequest[y].getStock() > 0) {
                numberOfRequest += 1;
                evRequest[y].setStock(evRequest[y].getStock() - 1);
                System.out.println(Thread.currentThread().getName() + "Number of request: " + numberOfRequest);
            }
        }
        try {
            Thread.sleep(rand.nextInt(100));
        } catch (InterruptedException e) {
        }
    }
}


