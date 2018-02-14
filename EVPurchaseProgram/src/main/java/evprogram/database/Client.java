package evprogram.database;

public class Client {
    public static void main(String[] args) throws Exception {

        /*
         * Print the electric vehicles stored in the database
         */

        ElectricVehicleDAO electricVehicleDAO = new ElectricVehicleDAO();
        try {
            electricVehicleDAO.getVehicles();
        } finally {
            electricVehicleDAO.listElectricVehicle(electricVehicleDAO);
        }
    }
}

