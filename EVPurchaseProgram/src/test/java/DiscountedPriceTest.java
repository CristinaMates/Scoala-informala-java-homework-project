import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.ElectricVehicle;
import ro.siit.evprogram.GreenBonusProgram;

import java.util.ArrayList;

public class DiscountedPriceTest {

    @Test
    public void discountedPriceTest() {
        GreenBonusProgram greenb = new GreenBonusProgram();
        ArrayList<ElectricVehicle> ee = new ArrayList<ElectricVehicle>();
        ee.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "NiCd", "30 KWh", 2012, 100, 140, 3, 25000));

        int newPrice = 0;
        for (ElectricVehicle elee : ee) {
            newPrice = elee.getPrice() - greenb.getFixedBudget();
        }
        System.out.println("new price: " + newPrice);
        System.out.println("expected price: 15000");
        Assert.assertEquals(15000, newPrice);
    }
}
