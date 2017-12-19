package ro.siit.evprogram;

import java.util.Arrays;

/**
 * @author Cristina Mates
 */

public class CarDealership {
    private String type;
    private boolean stock;
    private int price;

    public CarDealership(String type, boolean stock, int price) {
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

    public boolean getStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "type='" + type + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

    public void requestBonus(int price){

        this.price = price;
    }

}
