package ro.siit.evprogram;

import java.util.ArrayList;

/**
 * Method for throwing an exception if the customer's budget is less than the car's price.
 */

public class CustomerBudget {

    public void customerBudget(ArrayList<ElectricVehicle> el) throws IllegalArgumentException {

        int customerbudget = 3000;
        for (int z = 0; z < el.size(); z++) {
            if (el.get(z).getPrice() > customerbudget) {
                throw new IllegalArgumentException("Customer's budget should not be less than the car's price.");
            }
        }
    }
}
