package ro.siit.evprogram;

import java.util.Comparator;

/**
 * Comparator for comparing two cars by their prices
 */

public class PriceComparator implements Comparator<ElectricVehicle> {
    public int compare(ElectricVehicle o1, ElectricVehicle o2) {
        return o1.getPrice() > o2.getPrice() ? 1 : (o1.getPrice() < o2.getPrice() ? -1 : 0);
    }
}
