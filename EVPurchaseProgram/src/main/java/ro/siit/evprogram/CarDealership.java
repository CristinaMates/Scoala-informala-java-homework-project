package ro.siit.evprogram;

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
    }
}
