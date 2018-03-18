package ro.siit.evprogram;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ElectricVehicleCSVWriter {
    public static final String SEPARATOR = ",";
    public static final String NEW_LINE = "\n";
    public static final String HEADER = "manufacturer,model,fastCharging,electricMotor,electricBattery," +
            "energyConsumption,productionYear,rangePerCharge,horsePower,stock,price";

    public void writeEVCSV(String fileName) throws IOException {

        ArrayList<ElectricVehicle> ecarList = new ArrayList<ElectricVehicle>();
        ecarList.add(new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, 3, 25000));
        ecarList.add(new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000));
        ecarList.add(new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000));
        ecarList.add(new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, 1, 40000));
        ecarList.add(new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, 6, 22000));
        ecarList.add(new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700));
        ecarList.add(new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000));
        ecarList.add(new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000));
        ecarList.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 27000));

        FileWriter fWriter = null;

        try {
            fWriter = new FileWriter(fileName);
            fWriter.append(HEADER);
            fWriter.append(NEW_LINE);

            /**
             * Write ElectricVehicle object list to the CSV file
             */
            for (ElectricVehicle eCars : ecarList) {
                fWriter.append(eCars.getManufacturer());
                fWriter.append(SEPARATOR);
                fWriter.append(eCars.getModel());
                fWriter.append(SEPARATOR);
                fWriter.append(String.valueOf(eCars.isFastCharging()));
                fWriter.append(SEPARATOR);
                fWriter.append(eCars.getElectricMotor());
                fWriter.append(SEPARATOR);
                fWriter.append(eCars.getElectricBattery());
                fWriter.append(SEPARATOR);
                fWriter.append(eCars.getEnergyConsumption());
                fWriter.append(SEPARATOR);
                fWriter.append(String.valueOf(eCars.getProductionYear()));
                fWriter.append(SEPARATOR);
                fWriter.append(String.valueOf(eCars.getRangePerCharge()));
                fWriter.append(SEPARATOR);
                fWriter.append(String.valueOf(eCars.getHorsePower()));
                fWriter.append(SEPARATOR);
                fWriter.append(String.valueOf(eCars.getStock()));
                fWriter.append(SEPARATOR);
                fWriter.append(String.valueOf(eCars.getPrice()));
                fWriter.append(NEW_LINE);
            }
            System.out.println("\nCreated CSV file.");
        } catch (Exception e) {
            System.out.println("Error in CSV file.");
            e.printStackTrace();
        } finally {
            try {
                fWriter.flush();
                fWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter.");
                e.printStackTrace();
            }
        }
    }
}
