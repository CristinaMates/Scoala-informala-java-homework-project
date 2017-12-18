package ro.siit.evprogram;

import java.util.ArrayList;

public class CarsFullPrice {

    /**
     * Method for getting the car's full price
     *
     * @param cd
     * @return the car's full price
     */

    public int getPrice(ArrayList<CarDealership> cd) {
        int fullPrice = 0;
        for (CarDealership c : cd) {
            fullPrice = c.getPrice();
        }
        return fullPrice;
    }
}
