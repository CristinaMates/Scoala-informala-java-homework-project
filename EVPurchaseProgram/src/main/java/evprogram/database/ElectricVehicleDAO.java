package evprogram.database;

import ro.siit.evprogram.ElectricVehicle;
import java.sql.*;
import java.util.ArrayList;

public class ElectricVehicleDAO {

    public ArrayList<ElectricVehicle> getVehicles() throws Exception {
        ArrayList<ElectricVehicle> result = new ArrayList<ElectricVehicle>();
        try (
                Connection connection = ElectricVehicleDAO.newConnection("postgresql",
                        "localhost",
                        "5432",
                        "evpurchaseprogram",
                        "postgres",
                        "CristinaMates");

                Statement statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("select * from ElectricVehicle");

        ) {
            while (rs.next()) {
                ElectricVehicle eVeh = new ElectricVehicle("Volkswagen", "e-UP", true, "bldc", "Nicd", "30 KWh", 2012, 100, 140, 3, 25000);
                eVeh.setManufacturer(rs.getString("manufacturer"));
                eVeh.setModel(rs.getString("model"));
                eVeh.setFastCharging(rs.getBoolean("fast_charging"));
                eVeh.setElectricMotor(rs.getString("electric_motor"));
                eVeh.setElectricBattery(rs.getString("electric_battery"));
                eVeh.setEnergyConsumption(rs.getString("energy_consumption"));
                eVeh.setProductionYear(rs.getInt("production_year"));
                eVeh.setRangePerCharge(rs.getInt("range_per_charge"));
                eVeh.setHorsePower(rs.getInt("horse_power"));
                eVeh.setStock(rs.getInt("stock"));
                eVeh.setPrice(rs.getInt("price"));

                result.add(eVeh);
            }
        }
        return result;
    }

    private static void loadDriver() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }
    }

    private static Connection newConnection(String type,
                                            String host,
                                            String port,
                                            String dbName,
                                            String user,
                                            String pw) {

        loadDriver();
        DriverManager.setLoginTimeout(60);
        try {
            String url = new StringBuilder().append("jdbc:").append(type) // “mysql”
                    // /
                    // “db2”
                    // /
                    // “mssql”
                    // /
                    // “oracle”
                    // /
                    // ...
                    .append("://").append(host).append(":").append(port).append("/").append(dbName).append("?user=")
                    .append(user).append("&password=").append(pw).toString();
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }

        return null;
    }

    /**
     * method for printing the electric vehicles stored in the database
     *
     * @param evDAO
     * @throws Exception
     */
    public void listElectricVehicle(ElectricVehicleDAO evDAO) throws Exception {
        ArrayList<ElectricVehicle> evArraylist = evDAO.getVehicles();
        for (ElectricVehicle evList : evArraylist) {
            System.out.println(evList);
        }
    }
}
