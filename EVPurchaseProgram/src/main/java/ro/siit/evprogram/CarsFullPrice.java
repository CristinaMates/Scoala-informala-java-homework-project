package ro.siit.evprogram;

import java.util.ArrayList;

public class CarsFullPrice {

    /**
     * Method for getting the car's full price
     *
     * @return the car's full price
     */
    CustomerBudget customerb = new CustomerBudget();

    public int getFullPrice(ArrayList<ElectricVehicle> vehicle) {
        int fullPrice = 0;
        for (int a = 0; a < vehicle.size(); a++) {
            if ((vehicle.get(a).getStock() > 0) && (vehicle.get(a).getPrice() <= customerb.getCustomerbudget())) {
                fullPrice = vehicle.get(a).getPrice();
            }
        }
            return fullPrice;
    }
}
