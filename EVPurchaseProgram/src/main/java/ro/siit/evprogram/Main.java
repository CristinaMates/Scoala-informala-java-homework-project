package ro.siit.evprogram;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /**
         * Created an object ElectricVehicle array
         */
        //ElectricVehicle[] ev = new ElectricVehicle[9];
        //ev[0] = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, 3, 25000);
        //ev[1] = new ElectricVehicle("Volkswagen", "e-Golf", false, "dc", "vrla", "32 KWh", 2014, 150, 110, 5, 38000);
        //ev[2] = new ElectricVehicle("Renault", "Zoe", false, "ac", "li-ion", "35 KWh", 2016, 130, 140, 2, 33000);
        //ev[3] = new ElectricVehicle("BMW", "i3", true, "bldc", "vrla", "37 KWh", 2016, 160, 155, 1, 40000);
        //ev[4] = new ElectricVehicle("Smart", "FourTwo", true, "bldc", "vrla", "28 KWh", 2013, 110, 130, 6, 22000);
        //ev[5] = new ElectricVehicle("Smart", "FourFour", true, "ac", "NiCd", "30 KWh", 2017, 90, 115, 0, 22700);
        //ev[6] = new ElectricVehicle("Smart", "FourTwo Cabrio", false, "bldc", "li-ion", "42 KWh", 2016, 180, 120, 10, 23000);
        //ev[7] = new ElectricVehicle("Kia", "Soul", true, "dc", "NiCd", "40 KWh", 2015, 125, 90, 8, 34000);
        //ev[8] = new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 27000);

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
            CarsStock cStock = new CarsStock();
            ArrayList<ElectricVehicle> ele = new ArrayList<ElectricVehicle>();
            ele.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 0, 27000));
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
         * Print car's full price
         */
        ArrayList<ElectricVehicle> vehicle = new ArrayList<ElectricVehicle>();
        vehicle.add(new ElectricVehicle("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 8, 27000));
        CarsFullPrice cfp = new CarsFullPrice();
        System.out.println("\nCustomer purchase car at full price: " + cfp.getFullPrice(vehicle));

        /**
         * Try and catch block for handling the exception thown by the handleBonusRequest method
         */
        try {
            BonusRequest bonusRequest = new BonusRequest();
            bonusRequest.handleBonusRequest();
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }

        /**
         * Print message for receiving bonus offer or notification that there are no more bonuses
         */
        BonusController bc = new BonusController();
        System.out.println("\n");
        System.out.println(bc.bonusController());

        /**
         * Try and catch block for handling the exception thrown by the purchaseUsedEV method
         */
        try{
            ArrayList<CarDealership> car = new ArrayList<CarDealership>();
            car.add(new CarDealership("Hyundai", false, 0, 27000));
            UsedEV usedEV = new UsedEV("Hyundai", "Ioniq", true, "dc", "vrla", "34 KWh", 2011, 145, 100, 8, 27000);
            usedEV.purchaseUsedEV(car);
        }catch (IllegalArgumentException e){
            System.out.println("\n" + e.getMessage());
        }

        /**
         * Print the car's new price after receiving the discount
         */
        DiscountedPrice dp = new DiscountedPrice();
        System.out.println("\nCar's price after applying the discount is: " + dp.getDiscountedPrice(vehicle));
    }
}
