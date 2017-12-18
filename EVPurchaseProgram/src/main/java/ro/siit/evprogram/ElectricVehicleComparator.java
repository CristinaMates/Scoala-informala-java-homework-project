package ro.siit.evprogram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * chained comparator that is used to sort a list by multiple attributes
*/

public class ElectricVehicleComparator implements Comparator<ElectricVehicle> {
    private List<Comparator<ElectricVehicle>> listComparator;

    public ElectricVehicleComparator(Comparator<ElectricVehicle>... comparators) {
        this.listComparator = Arrays.asList(comparators);
    }

    public int compare(ElectricVehicle o1, ElectricVehicle o2) {
        for (Comparator<ElectricVehicle> cmp : listComparator) {
            int result = cmp.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
