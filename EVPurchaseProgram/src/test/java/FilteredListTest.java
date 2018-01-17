import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.CarDealership;
import ro.siit.evprogram.ElectricVehicle;


public class FilteredListTest {
    @Test
    public void filterTestFastCharging() {
        ElectricVehicle[] ev = new ElectricVehicle[3];
        ev[0] = new ElectricVehicle("Smart","FourFour", true, "ac", "NiCd", "30 KWh", 2017, "90 miles", "115hp", 0);
        ev[1] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, "180 miles", "120 hp", 10);
        ev[2] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40KWh", 2015, "125 miles", "90hp", 8);

        CarDealership car = new CarDealership("new", 3, 25000);
        car.filterFastCharging(ev);

        ElectricVehicle[] expectedOutput = new ElectricVehicle[3];
        expectedOutput[0] = new ElectricVehicle("Smart","FourFour", true, "ac", "NiCd", "30 KWh", 2017, "90 miles", "115hp", 0);
        expectedOutput[1] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40KWh", 2015, "125 miles", "90hp", 8);

        Assert.assertTrue(expectedOutput[0].isFastCharging()==true);
        Assert.assertTrue(expectedOutput[1].isFastCharging()==true);

    }

        @Test
        public void filteredStock(){
            ElectricVehicle[] ev = new ElectricVehicle[3];
            ev[0] = new ElectricVehicle("Smart","FourFour", true, "ac", "NiCd", "30 KWh", 2017, "90 miles", "115hp", 0);
            ev[1] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, "180 miles", "120 hp", 10);
            ev[2] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40KWh", 2015, "125 miles", "90hp", 8);

            CarDealership car = new CarDealership("new", 3, 25000);
            car.filterStock(ev);

            ElectricVehicle[] expectedList = new ElectricVehicle[3];
            expectedList[0] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, "180 miles", "120 hp", 10);
            expectedList[1] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40KWh", 2015, "125 miles", "90hp", 8);

            Assert.assertTrue(expectedList[0].getStock()!=0);
            Assert.assertTrue(expectedList[1].getStock()!=0);
        }
    }
