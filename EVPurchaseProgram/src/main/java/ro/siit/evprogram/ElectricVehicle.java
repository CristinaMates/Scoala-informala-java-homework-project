package ro.siit.evprogram;

public class ElectricVehicle {
    private String electricMotor;
    private String electricBattery;
    private String energyConsumption;
    private String manufacturer;
    private String model;
    private int productionYear;
    private boolean stock;
    private boolean fastCharging;
    private int rangePerCharge;
    private int horsePower;
    private int price;

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
     * @param price
     */

    public ElectricVehicle(String manufacturer, String model, boolean fastCharging, String electricMotor, String electricBattery, String energyConsumption, int productionYear, int rangePerCharge, int horsePower, boolean stock, int price) {
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
        this.price = price;
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

    public int getRangePerCharge() {
        return rangePerCharge;
    }

    public void setRangePerCharge(int rangerPerCharge) {
        this.rangePerCharge = rangerPerCharge;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ElectricVehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", price=" + price +
                ", rangePerCharge='" + rangePerCharge + '\'' +
                ", horsePower='" + horsePower + '\'' +
                ", electricMotor='" + electricMotor + '\'' +
                ", electricBattery='" + electricBattery + '\'' +
                ", energyConsumption='" + energyConsumption + '\'' +
                ", stock=" + stock +
                ", fastCharging=" + fastCharging +
                '}';
    }
}
