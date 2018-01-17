package ro.siit.evprogram;

public class ElectricVehicle {
    private String electricMotor;
    private String electricBattery;
    private String energyConsumption;
    private String manufacturer;
    private String model;
    private int productionYear;
    private int stock;
    private boolean fastCharging;
    private String rangePerCharge;
    private String horsePower;

    /**
     * Constructor for initializing ElectricVehicle object
     *
     * @param manufacturer
     * @param model
     * @param fastCharging
     * @param stock
     * @param electricMotor
     * @param electricBattery
     * @param energyConsumption
     * @param productionYear
     * @param rangePerCharge
     * @param horsePower
     */

    public ElectricVehicle(String manufacturer, String model, boolean fastCharging, String electricMotor, String electricBattery, String energyConsumption, int productionYear, String rangePerCharge, String horsePower, int stock) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.fastCharging = fastCharging;
        this.electricMotor = electricMotor;
        this.electricBattery = electricBattery;
        this.energyConsumption = energyConsumption;
        this.productionYear = productionYear;
        this.rangePerCharge = rangePerCharge;
        this.horsePower = horsePower;
        this.stock = stock;
    }

    public String getElectricMotor() {
        return electricMotor;
    }

    public void setElectricMotor(String electricMotor) {
        this.electricMotor = electricMotor;
    }

    public String getElectricBattery() {
        return electricBattery;
    }

    public void setElectricBattery(String electricBattery) {
        this.electricBattery = electricBattery;
    }

    public String getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(String energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public boolean isFastCharging() {
        return fastCharging;
    }

    public void setFastCharging(boolean fastCharging) {
        this.fastCharging = fastCharging;
    }

    public String getRangePerCharge() {
        return rangePerCharge;
    }

    public void setRangePerCharge(String rangerPerCharge) {
        this.rangePerCharge = rangerPerCharge;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "electricMotor='" + electricMotor + '\'' +
                ", electricBattery='" + electricBattery + '\'' +
                ", energyConsumption='" + energyConsumption + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", stock=" + stock +
                ", fastCharging=" + fastCharging +
                ", rangePerCharge='" + rangePerCharge + '\'' +
                ", horsePower='" + horsePower + '\'' +
                '}';

    }
}
