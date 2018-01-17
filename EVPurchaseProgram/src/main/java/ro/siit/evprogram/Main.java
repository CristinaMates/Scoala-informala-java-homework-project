package ro.siit.evprogram;

public class Main {
    public static void main(String[] args) {

        /**
         * Created an object ElectricVehicle array
         */

        ElectricVehicle[] ev = new ElectricVehicle[9];
        ev[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, "100 miles", "140 hp", 3);
        ev[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, "150 miles", "110 hp", 5);
        ev[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, "130 miles", "140 hp", 2);
        ev[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, "160 miles", "155 hp", 1);
        ev[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, "110 miles", "130 hp", 6);
        ev[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, "90 miles", "115 hp", 0);
        ev[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, "180 miles", "120 hp", 10);
        ev[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, "125 miles", "90 hp", 8);
        ev[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, "145 miles", "100 hp", 0);

        /**
         * Filter cars by fast-charging and by stock
         */

        CarDealership filterc = new CarDealership("new", 3, 25000);
        filterc.filterFastCharging(ev);
        System.out.println("\n");
        filterc.filterStock(ev);

    }
}
