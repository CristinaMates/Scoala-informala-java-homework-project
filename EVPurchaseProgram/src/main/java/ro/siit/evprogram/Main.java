package ro.siit.evprogram;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

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

        CarDealership filterc = new CarDealership("Hyundai", true, 3, 27000);
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
         * Try and catch block for handling the exception thrown by the carsStock method
         */
        try {
            CarDealership cStock = new CarDealership();
            ArrayList<ElectricVehicle> ele = new ArrayList<ElectricVehicle>();
            ele.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 3, 27000));
            cStock.carsStock(ele);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }

        /**
         * Try and catch block for handling the exception thrown by the customerBudget method
         */
        try {
            CustomerBudget customer = new CustomerBudget();
            ArrayList<ElectricVehicle> el = new ArrayList<ElectricVehicle>();
            el.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 27000));
            customer.customerBudget(el);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }

        /**
         * Purchase car at full price
         */
        ArrayList<ElectricVehicle> vehicle = new ArrayList<ElectricVehicle>();
        vehicle.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 8, 27000));
        CarDealership cd = new CarDealership();
        System.out.println("\nCustomer purchases car at full price: " + cd.getFullPrice(vehicle));

        /**
         * Try and catch block for handling the exception thrown by the handleBonusRequest method
         */
        try {
            GreenBonusProgram bonusRequest = new GreenBonusProgram();
            bonusRequest.handleBonusRequest();
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }

        /**
         * Try and catch block for handling the exception thrown by the purchaseUsedEV method
         */
        try {
            ArrayList<CarDealership> car = new ArrayList<CarDealership>();
            car.add(new CarDealership("Hyundai", false, 3, 27000));
            CarDealership carDealership = new CarDealership();
            carDealership.purchaseUsedEV(car);
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }

        /**
         * Purchase car with discounted price
         */
        System.out.println("\n");
        System.out.println("Customer purchases car with discounted price: ");
        System.out.println(cd.getDiscountedPrice(vehicle));

        /**
         *Sorting the array by using the Quick Sort algorithm
         */
        QuickSort<ElectricVehicle> qsort = new QuickSort<ElectricVehicle>();
        qsort.arr = ev;
        System.out.println("\nSorted cars by using the quicksorting algorithm: ");
        qsort.sort();
        qsort.printArray();

        /**
         * Store cars in CSV file
         */
        String file = "C:/Users/Cristina/Documents/Scoala-informala-java-homework-project/EVPurchaseProgram/electricvehicle.csv";
        ElectricVehicleCSVWriter evwriter = new ElectricVehicleCSVWriter();
        evwriter.writeEVCSV(file);

        /**
         * Read from the CSV file
         */
        ElectricVehicleCSVReader evreader = new ElectricVehicleCSVReader();
        evreader.readEVCSV(file);

        /**
         * Green Bonus Program is able to handle multiple dealership requests concurrently
         */
        Request request = new Request();
        CarDealership carDealership = new CarDealership(request);
        GreenBonusProgram greenBonus = new GreenBonusProgram(request);
        Thread t1 = new Thread(carDealership);
        Thread t2 = new Thread(greenBonus);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}