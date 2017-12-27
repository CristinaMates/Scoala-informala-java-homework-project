package ro.siit.evprogram;

import java.util.ArrayList;

public class DiscountedPrice {

    GreenBonusProgram gbp = new GreenBonusProgram();

    /**
     * Method for calculating the price after using the discount
     *
     * @return
     */

    public int getDiscountedPrice(ArrayList<ElectricVehicle> elv) {
        int newPrice = 0;
        if (gbp.getTotalSum() >= 10000) {
            for (int w = 0; w < elv.size(); w++) {
                newPrice = elv.get(w).getPrice() - gbp.getFixedBudget();
            }
        }
        return newPrice;
    }
}
