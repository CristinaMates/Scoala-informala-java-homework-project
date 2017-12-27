package ro.siit.evprogram;

import java.util.ArrayList;

public class UsedEV extends ElectricVehicle {

    /**
     * Constructor for initializing ElectricVehicle object
     */
    public UsedEV(String manufacturer, String model, boolean fastCharging, String electricMotor, String electricBattery, String energyConsumption, int productionYear, int rangePerCharge, int horsePower, int stock, int price) {
        super(manufacturer, model, fastCharging, electricMotor, electricBattery, energyConsumption, productionYear, rangePerCharge, horsePower, stock, price);
    }

    public void purchaseUsedEV(ArrayList<CarDealership> car) throws IllegalArgumentException {
        for (int b = 0; b < car.size(); b++) {
            if (car.get(b).isNewCar() == false) {
                throw new IllegalArgumentException("Cannot purchase an used car with green bonus.");
            }
        }
    }
}
