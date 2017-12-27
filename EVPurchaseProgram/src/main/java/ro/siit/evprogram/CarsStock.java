package ro.siit.evprogram;

import java.util.ArrayList;

/**
 * Method for throwing an exception if the car is out of stock.
 */

public class CarsStock {

    public void carsStock(ArrayList<ElectricVehicle> ele) throws IllegalArgumentException {
        for (int i = 0; i < ele.size(); i++) {
            if ((ele.get(i).getStock() <= 0)) {
                throw new IllegalArgumentException("The car should be in stock in order to purchase it.");
            }
        }
    }
}
