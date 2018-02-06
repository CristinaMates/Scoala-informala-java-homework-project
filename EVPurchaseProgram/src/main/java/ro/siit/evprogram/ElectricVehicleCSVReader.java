package ro.siit.evprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ElectricVehicleCSVReader {
    public static final int MANUFACTURER = 0;
    public static final int MODEL = 1;
    public static final int FAST_CHARGING = 2;
    public static final int ELECTRIC_MOTOR = 3;
    public static final int ELECTRIC_BATTERY = 4;
    public static final int ENERGY_CONSUMPTION = 5;
    public static final int PRODUCTION_YEAR = 6;
    public static final int RANGE_PER_CHARGE = 7;
    public static final int HORSE_POWER = 8;
    public static final int STOCK = 9;
    public static final int PRICE = 10;


    public void readEVCSV(String fileName) throws IOException {
        BufferedReader fReader = null;

        try {
            fReader = new BufferedReader(new FileReader(fileName));
            ArrayList<ElectricVehicle> ecList = new ArrayList<ElectricVehicle>();
            String line = "";

            /**
             * Method for reading the CSV's file header and to skip it
             */
            fReader.readLine();

            /**
             * Start reading from the second line of the file
             */
            while ((line = fReader.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length > 0) {
                    ElectricVehicle electricVehicles = new ElectricVehicle(
                            tokens[MANUFACTURER],
                            tokens[MODEL],
                            Boolean.parseBoolean(tokens[FAST_CHARGING]),
                            tokens[ELECTRIC_MOTOR],
                            tokens[ELECTRIC_BATTERY],
                            tokens[ENERGY_CONSUMPTION],
                            Integer.parseInt(tokens[PRODUCTION_YEAR]),
                            Integer.parseInt(tokens[RANGE_PER_CHARGE]),
                            Integer.parseInt(tokens[HORSE_POWER]),
                            Integer.parseInt(tokens[STOCK]),
                            Integer.parseInt(tokens[PRICE]));
                    ecList.add(electricVehicles);
                }
            }
            System.out.println("\n");
            for (ElectricVehicle electricVehicles : ecList) {
                System.out.println(electricVehicles.toString());
            }
        } catch (Exception e) {
            System.out.println("Error in CSV reader.");
            e.printStackTrace();
        } finally {
            try {
                fReader.close();
            } catch (IOException e) {
                System.out.println("Error while closing fileReader.");
                e.printStackTrace();
            }
        }
    }
}
