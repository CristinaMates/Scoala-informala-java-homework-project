import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.*;

import java.util.ArrayList;
import java.util.Collections;

public class SortListTest {

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
}
