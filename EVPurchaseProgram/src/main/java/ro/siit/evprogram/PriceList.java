package ro.siit.evprogram;

public class PriceList {
    private int priceL;

    public PriceList(int priceL) {
        this.priceL = priceL;
    }

    public int getPriceL() {
        return priceL;
    }

    public void setPriceL(int priceL) {
        this.priceL = priceL;
    }

    @Override
    public String toString() {
        return "PriceList{" +
                "price=" + priceL +
                '}';
    }
}
