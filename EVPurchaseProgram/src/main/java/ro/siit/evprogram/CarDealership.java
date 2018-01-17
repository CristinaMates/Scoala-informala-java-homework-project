package ro.siit.evprogram;

import java.util.Arrays;

/**
 * @author Cristina Mates
 */

public class CarDealership {
    private String type;
    private int stock;
    private int price;
    private GreenBonusProgram gbp;
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

    public GreenBonusProgram getGbp() {
        return gbp;
    }

    public void setGbp(GreenBonusProgram gbp) {
        this.gbp = gbp;
    }

    public ElectricVehicle[] getEv() {
        return ev;
    }

    public void setEv(ElectricVehicle[] ev) {
        this.ev = ev;
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

    @Override
    public String toString() {
        return "CarDealership{" +
                "type='" + type + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", gbp=" + gbp +
                ", ev=" + Arrays.toString(ev) +
                '}';
    }
}

