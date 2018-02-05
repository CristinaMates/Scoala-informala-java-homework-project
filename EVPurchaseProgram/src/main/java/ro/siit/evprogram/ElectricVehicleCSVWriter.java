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

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(HEADER.toString());
            fileWriter.append(NEW_LINE);

            /**
             * Write ElectricVehicle object list to the CSV file
             */
            for (ElectricVehicle eCars : ecarList) {
                fileWriter.append(eCars.getManufacturer());
                fileWriter.append(SEPARATOR);
                fileWriter.append(eCars.getModel());
                fileWriter.append(SEPARATOR);
                fileWriter.append(String.valueOf(eCars.isFastCharging()));
                fileWriter.append(SEPARATOR);
                fileWriter.append(eCars.getElectricMotor());
                fileWriter.append(SEPARATOR);
                fileWriter.append(eCars.getElectricBattery());
                fileWriter.append(SEPARATOR);
                fileWriter.append(eCars.getEnergyConsumption());
                fileWriter.append(SEPARATOR);
                fileWriter.append(String.valueOf(eCars.getProductionYear()));
                fileWriter.append(SEPARATOR);
                fileWriter.append(String.valueOf(eCars.getRangePerCharge()));
                fileWriter.append(SEPARATOR);
                fileWriter.append(String.valueOf(eCars.getHorsePower()));
                fileWriter.append(SEPARATOR);
                fileWriter.append(String.valueOf(eCars.getStock()));
                fileWriter.append(SEPARATOR);
                fileWriter.append(String.valueOf(eCars.getPrice()));
                fileWriter.append(NEW_LINE);
            }
            System.out.println("\nCreated CSV file.");
        } catch (Exception e) {
            System.out.println("Error in CSV file.");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter.");
                e.printStackTrace();
            }
        }
    }
}
