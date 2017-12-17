package ro.siit.evprogram;

public class Main {
    public static void main(String[] args) {

        /**
         * Created an object ElectricVehicle array
         */

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

        /**
         * Filter the array
         */

        FilterCars filterc = new FilterCars();
        ElectricVehicle[] filteredCars = filterc.filter(ev);
        
        /**
         * Print the array
         */

        for (ElectricVehicle filtered : ev) {
            System.out.println(filtered);
        }

    }
}
