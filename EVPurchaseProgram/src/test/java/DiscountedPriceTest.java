import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.GreenBonusProgram;
import ro.siit.evprogram.PriceList;

import java.util.ArrayList;

public class DiscountedPriceTest {

    @Test
    public void discountedPriceTest() {
        GreenBonusProgram greenb = new GreenBonusProgram();
        ArrayList<PriceList> p = new ArrayList<PriceList>();
        p.add(new PriceList(38000));

        int newPrice = 0;
        for (PriceList prl : p) {
            newPrice = prl.getPriceL() - greenb.getFixedBudget();
        }
        System.out.println("new price: " + newPrice);
        System.out.println("expected price: 28000");
        Assert.assertEquals(28000, newPrice);
    }
}
