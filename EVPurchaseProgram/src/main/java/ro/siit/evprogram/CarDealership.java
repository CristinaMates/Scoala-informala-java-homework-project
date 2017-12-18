package ro.siit.evprogram;

import java.util.Arrays;

/**
 * @author Cristina Mates
 */

public class CarDealership {
    private String type;
    private int stock;
    private int price;
    GreenBonusProgram gbp;
    ElectricVehicle[] ev = new ElectricVehicle[9];

    public CarDealership(String type, int stock, int price, ElectricVehicle[] ev) {
        this.type = type;
        this.stock = stock;
        this.price = price;
        this.ev = ev;
        ev[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, true, 25000);
        ev[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, true, 38000);
        ev[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, true, 33000);
        ev[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, true, 40000);
        ev[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, true, 22000);
        ev[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, false, 22700);
        ev[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, true, 23000);
        ev[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, false, 34000);
        ev[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, true, 27000);

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
