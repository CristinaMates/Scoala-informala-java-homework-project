package ro.siit.evprogram;

import java.util.ArrayList;

/**
 * @author Cristina Mates
 */

public class CarDealership {
    private String type;
    private int stock;
    private int price;
    private GreenBonusProgram gbprogram;
    ElectricVehicle[] ev = new ElectricVehicle[9];

    public CarDealership(String type, int stock, int price) {
        this.type = type;
        this.stock = stock;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
            newPrice = elevehicle.getPrice() - gbp.getFixedBudget();
        }
        return newPrice;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "type='" + type + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

    public void requestBonus(int price) {

        this.price = price;
    }

}
