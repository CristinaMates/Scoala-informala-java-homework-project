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

        CarDealership car = new CarDealership("Hyundai",true, 3, 27000);
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

        CarDealership car = new CarDealership("Hyundai", true, 3, 27000);
        car.filterStock(ev);

        ElectricVehicle[] expectedOutput = new ElectricVehicle[3];
        expectedOutput[0] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000);
        expectedOutput[1] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000);

        Assert.assertTrue(expectedOutput[0].getStock() > 0);
        Assert.assertTrue(expectedOutput[1].getStock() > 0);

    }
}

