import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.*;

import java.util.ArrayList;
import java.util.Collections;


public class FilteredListTest {
    @Test
    public void filterTestFastCharging() {
        ElectricVehicle[] ev = new ElectricVehicle[3];
        ev[0] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700);
        ev[1] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000);
        ev[2] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000);

        CarDealership car = new CarDealership("new", 3, 25000);
        car.filterFastCharging(ev);

        ElectricVehicle[] expectedOutput = new ElectricVehicle[3];
        expectedOutput[0] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700);
        expectedOutput[1] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000);

        Assert.assertTrue(expectedOutput[0].isFastCharging()==true);
        Assert.assertTrue(expectedOutput[1].isFastCharging()==true);

    }

    @Test
    public void filteredStock(){
        ElectricVehicle[] ev = new ElectricVehicle[3];
        ev[0] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700);
        ev[1] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000);
        ev[2] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000);

        CarDealership car = new CarDealership("new", 3, 25000);
        car.filterStock(ev);

        ElectricVehicle[] expectedOutput = new ElectricVehicle[3];
        expectedOutput[0] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000);
        expectedOutput[1] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000);

        Assert.assertTrue(expectedOutput[0].getStock() > 0);
        Assert.assertTrue(expectedOutput[1].getStock() > 0);

    }

    @Test
    public void sortListTest() {
        ElectricVehicleComparator evc = new ElectricVehicleComparator();
        ArrayList<ElectricVehicle> ar = new ArrayList<ElectricVehicle>();
        ar.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "NiCd", "30 KWh", 2012, 100, 140, 3, 25000));
        ar.add(new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000));
        ar.add(new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000));

        Collections.sort(ar, new ElectricVehicleComparator(
                new PriceComparator(),
                new RangePerChargeComparator(),
                new HorsePowerComparator())
        );
        System.out.println(ar);

        ArrayList<ElectricVehicle> expectedArray = new ArrayList<ElectricVehicle>();
        expectedArray.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "NiCd", "30 KWh", 2012, 100, 140, 3, 25000));
        expectedArray.add(new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000));
        expectedArray.add(new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000));


        Assert.assertEquals(expectedArray, ar);
        System.out.println(ar);
    }

    @Test
    public void bonusTest() {
        GreenBonusProgram gb = new GreenBonusProgram();

        if (gb.getTotalSum() >= 10000) {
            int bonusReceived = gb.getFixedBudget();
            System.out.println("Customer receives bonus of: " + gb.getFixedBudget());
        } else {
            System.out.println("There are no more bonuses");
        }
        Assert.assertTrue(gb.getTotalSum() >= 10000);
    }


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