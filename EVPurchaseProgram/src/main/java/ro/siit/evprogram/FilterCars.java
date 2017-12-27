package ro.siit.evprogram;

public class FilterCars {

    /**
     * Created method in order to filter the list based on the fast charging  and stock criteria
     *
     * @param ev
     * @return
     */

    public ElectricVehicle[] filter(ElectricVehicle[] ev) {
        for (int i = 0; i < ev.length - 1; i++) {
            if ((ev[i].isFastCharging() == true) && (ev[i].getStock() > 0)) {
                System.out.println(ev[i]);
            }
        }
        return ev;
    }
}
