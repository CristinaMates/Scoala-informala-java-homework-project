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

    public ElectricVehicle(String manufacturer, String model, boolean fastCharging, String electricMotor, String electricBattery, String energyConsumption, int productionYear, int rangePerCharge, int horsePower, int stock, int price) {
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricVehicle that = (ElectricVehicle) o;

        if (productionYear != that.productionYear) return false;
        if (stock != that.stock) return false;
        if (fastCharging != that.fastCharging) return false;
        if (rangePerCharge != that.rangePerCharge) return false;
        if (horsePower != that.horsePower) return false;
        if (price != that.price) return false;
        if (electricMotor != null ? !electricMotor.equals(that.electricMotor) : that.electricMotor != null)
            return false;
        if (electricBattery != null ? !electricBattery.equals(that.electricBattery) : that.electricBattery != null)
            return false;
        if (energyConsumption != null ? !energyConsumption.equals(that.energyConsumption) : that.energyConsumption != null)
            return false;
        if (manufacturer != null ? !manufacturer.equals(that.manufacturer) : that.manufacturer != null) return false;
        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        int result = electricMotor != null ? electricMotor.hashCode() : 0;
        result = 31 * result + (electricBattery != null ? electricBattery.hashCode() : 0);
        result = 31 * result + (energyConsumption != null ? energyConsumption.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + productionYear;
        result = 31 * result + (stock);
        result = 31 * result + (fastCharging ? 1 : 0);
        result = 31 * result + rangePerCharge;
        result = 31 * result + horsePower;
        result = 31 * result + price;
        return result;
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
