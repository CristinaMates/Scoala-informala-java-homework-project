import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.*;

import java.util.ArrayList;
import java.util.Collections;


public class FilteredListTest {
    @Test
    public void filterListTest() {
        ElectricVehicle[] ev = new ElectricVehicle[9];
        ev[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, true, 25000);
        ev[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, true, 38000);
        ev[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, true, 33000);
        ev[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, true, 40000);
        ev[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, true, 22000);
        ev[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, false, 22700);
        ev[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, true, 23000);
        ev[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, false, 34000);
        ev[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, true, 27000);

        FilterCars filterc = new FilterCars();
        filterc.filter(ev);

        ElectricVehicle[] expectedOrder = new ElectricVehicle[9];
        expectedOrder[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, true, 25000);
        expectedOrder[1] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, true, 40000);
        expectedOrder[2] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, true, 22000);
        expectedOrder[3] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, false, 22700);
        expectedOrder[4] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, false, 34000);
        expectedOrder[5] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, true, 27000);
        expectedOrder[6] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, true, 38000);
        expectedOrder[7] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, true, 33000);
        expectedOrder[8] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, true, 23000);

        Assert.assertArrayEquals(expectedOrder, ev);

    }

    @Test
    public void sortListTest() {
        ElectricVehicleComparator evc = new ElectricVehicleComparator();
        ArrayList<ElectricVehicle> ar = new ArrayList<ElectricVehicle>();
        ar.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "NiCd", "30 KWh", 2012, 100, 140, true, 25000));
        ar.add(new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, true, 38000));
        ar.add(new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, true, 33000));

        Collections.sort(ar, new ElectricVehicleComparator(
                new PriceComparator(),
                new RangePerChargeComparator(),
                new HorsePowerComparator())
        );
        System.out.println(ar);

        ArrayList<ElectricVehicle> expectedArray = new ArrayList<ElectricVehicle>();
        expectedArray.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "NiCd", "30 KWh", 2012, 100, 140, true, 25000));
        expectedArray.add(new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, true, 33000));
        expectedArray.add(new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, true, 38000));


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