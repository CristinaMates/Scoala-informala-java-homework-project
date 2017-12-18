package ro.siit.evprogram;

import java.util.Comparator;

/**
 * Comparator for comparing two cars by their range per charge
 */

public class RangePerChargeComparator implements Comparator<ElectricVehicle> {
    public int compare(ElectricVehicle o1, ElectricVehicle o2) {
        return o1.getRangePerCharge() > o2.getRangePerCharge() ? 1 : (o1.getRangePerCharge() < o2.getRangePerCharge() ? -1 : 0);
    }
}

