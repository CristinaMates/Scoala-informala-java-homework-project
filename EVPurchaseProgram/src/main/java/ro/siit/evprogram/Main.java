package ro.siit.evprogram;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        /**
         * Created an object ElectricVehicle array
         */

        ElectricVehicle[] ev = new ElectricVehicle[9];

        ev[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, 3, 25000);
        ev[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000);
        ev[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000);
        ev[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, 1, 40000);
        ev[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, 6, 22000);
        ev[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700);
        ev[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000);
        ev[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000);
        ev[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 27000);


        /**
         * Filter cars by fast-charging and by stock
         */

        CarDealership filterc = new CarDealership("new", 3, 25000);
        filterc.filterFastCharging(ev);
        System.out.println("\n");
        filterc.filterStock(ev);
        System.out.println("\n");


        ArrayList<ElectricVehicle> evList = new ArrayList<ElectricVehicle>();
        evList.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, 3, 25000));
        evList.add(new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000));
        evList.add(new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000));
        evList.add(new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, 1, 40000));
        evList.add(new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, 6, 22000));
        evList.add(new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700));
        evList.add(new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000));
        evList.add(new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000));
        evList.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 27000));

        /**
         * Sorting an ArrayList collection by multiple attributes
         */

        Collections.sort(evList, new ElectricVehicleComparator(
                new PriceComparator(),
                new RangePerChargeComparator(),
                new HorsePowerComparator())
        );
        for (ElectricVehicle evl : evList) {
            System.out.println(evl);
        }


        /**
         * Purchase car at full price
         */

        ArrayList<ElectricVehicle> vehicle = new ArrayList<ElectricVehicle>();
        vehicle.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 8, 27000));
        CarDealership cd = new CarDealership("new", 8, 27000);
        System.out.println("\nCustomer purchases car at full price: " + cd.getFullPrice(vehicle));


        BonusController bc = new BonusController();
        System.out.println("\n");
        System.out.println(bc.bonusController());

        /**
         * Purchase car with discounted price
         */

        System.out.println("\n");
        System.out.println("Customer purchases car with discounted price: ");
        System.out.println(cd.getDiscountedPrice(vehicle));
    }
}
