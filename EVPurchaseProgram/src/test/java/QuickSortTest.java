import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.ElectricVehicle;
import ro.siit.evprogram.QuickSort;

public class QuickSortTest {

    @Test
    public void quicksortTest(){
        ElectricVehicle [] electricV = new ElectricVehicle[3];
        electricV[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "NiCd", "30 KWh", 2012, 100, 140, 3, 25000);
        electricV[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000);
        electricV[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000);

        QuickSort<ElectricVehicle> qsort = new QuickSort<ElectricVehicle>();
        qsort.arr = electricV;
        qsort.sort();
        qsort.printArray();
        System.out.println("\n");

        ElectricVehicle [] expectedO = new ElectricVehicle[3];
        expectedO[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "NiCd", "30 KWh", 2012, 100, 140, 3, 25000);
        expectedO[1] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000);
        expectedO[2] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000);
        for(ElectricVehicle expect:expectedO){
            System.out.println(expect);
        }

        Assert.assertArrayEquals(expectedO, electricV);
    }

}
