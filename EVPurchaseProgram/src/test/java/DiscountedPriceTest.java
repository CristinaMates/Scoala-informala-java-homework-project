import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.ElectricVehicle;
import ro.siit.evprogram.GreenBonusProgram;

import java.util.ArrayList;

public class DiscountedPriceTest {

    @Test
    public void discountedPriceTest() {
        GreenBonusProgram greenb = new GreenBonusProgram();
        ArrayList<ElectricVehicle> e = new ArrayList<ElectricVehicle>();
        e.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 28000));

        int newPrice = 0;
        if (greenb.getTotalSum() >= 10000) {
            for (int w = 0; w < e.size(); w++) {
                newPrice = e.get(w).getPrice() - greenb.getFixedBudget();
            }
        }
        System.out.println("new price: " + newPrice);
        System.out.println("expected price: 18000");
        Assert.assertEquals(18000, newPrice);
    }
}
