package ro.siit.evprogram;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * Created an object ElectricVehicle array
         */

        //ElectricVehicle[] ev = new ElectricVehicle[9];
        //ev[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, true, 25000);
        //ev[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, true, 38000);
        //ev[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, true, 33000);
        //ev[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, true, 40000);
        //ev[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, true, 22000);
        //ev[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, false, 22700);
        //ev[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, true, 23000);
        //ev[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, false, 34000);
        //ev[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, true, 27000);

        /**
         * Filter the array
         */

        //FilterCars filterc = new FilterCars();
        //ElectricVehicle[] filteredCars = filterc.filter(ev);

        /**
         * Print the array
         */

        //for (ElectricVehicle filtered : ev) {
        //System.out.println(filtered);}


        ArrayList<ElectricVehicle> evList = new ArrayList<ElectricVehicle>();
        evList.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, true, 25000));
        evList.add(new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, true, 38000));
        evList.add(new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, true, 33000));
        evList.add(new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, true, 40000));
        evList.add(new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, true, 22000));
        evList.add(new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, false, 22700));
        evList.add(new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, true, 23000));
        evList.add(new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, false, 34000));
        evList.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, true, 27000));

    }
}
