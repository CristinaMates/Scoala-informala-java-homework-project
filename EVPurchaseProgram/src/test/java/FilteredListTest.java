import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.ElectricVehicle;
import ro.siit.evprogram.FilterCars;


public class FilteredListTest {
    @Test
    public void filterListTest() {
        ElectricVehicle[] ev = new ElectricVehicle[9];
        ev[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, "100 miles", "140 hp", true);
        ev[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, "150 miles", "110 hp", true);
        ev[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, "130 miles", "140 hp", true);
        ev[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, "160 miles", "155 hp", true);
        ev[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, "110 miles", "130 hp", true);
        ev[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, "90 miles", "115 hp", false);
        ev[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, "180 miles", "120 hp", true);
        ev[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, "125 miles", "90 hp", false);
        ev[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, "145 miles", "100 hp", true);

        FilterCars filterc = new FilterCars();
        filterc.filter(ev);

        ElectricVehicle[] expectedOrder = new ElectricVehicle[9];
        expectedOrder[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, "100 miles", "140 hp", true);
        expectedOrder[1] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, "160 miles", "155 hp", true);
        expectedOrder[2] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, "110 miles", "130 hp", true);
        expectedOrder[3] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, "90 miles", "115 hp", false);
        expectedOrder[4] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, "125 miles", "90 hp", false);
        expectedOrder[5] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, "145 miles", "100 hp", true);
        expectedOrder[6] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, "150 miles", "110 hp", true);
        expectedOrder[7] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, "130 miles", "140 hp", true);
        expectedOrder[8] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, "180 miles", "120 hp", true);

        Assert.assertArrayEquals(expectedOrder, ev);

    }


}
