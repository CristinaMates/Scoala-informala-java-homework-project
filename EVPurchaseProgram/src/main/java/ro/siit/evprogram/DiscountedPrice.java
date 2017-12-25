package ro.siit.evprogram;

import java.util.ArrayList;

public class DiscountedPrice {

    GreenBonusProgram gbp = new GreenBonusProgram();

    /**
     * Method for calculating the price after using the discount
     * @param prices
     * @return
     */

    public int getDiscountedPrice(ArrayList<PriceList> prices) {
        int newPrice = 0;
        if (gbp.getTotalSum() >= 10000) {
            for (PriceList prl : prices) {
                newPrice = prl.getPriceL() - gbp.getFixedBudget();
            }
        }
            return newPrice;
    }
}
