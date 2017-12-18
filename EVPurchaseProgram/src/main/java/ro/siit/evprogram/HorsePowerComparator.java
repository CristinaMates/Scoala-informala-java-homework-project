package ro.siit.evprogram;

import java.util.Comparator;

/**
 * Comparator for comparing two cars by their horsepower
 */

public class HorsePowerComparator implements Comparator<ElectricVehicle> {
    public int compare(ElectricVehicle o1, ElectricVehicle o2) {
        return o1.getHorsePower() > o2.getHorsePower() ? 1 : (o1.getHorsePower() < o2.getHorsePower() ? -1 : 0);
    }
}

