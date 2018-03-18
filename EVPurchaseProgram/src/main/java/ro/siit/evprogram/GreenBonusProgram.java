package ro.siit.evprogram;

public class GreenBonusProgram {
    private int fixedBudget = 10000;
    private String[] HistoryOfPurchases;
    private int totalSum = 0;

    public int getFixedBudget() {
        return fixedBudget;
    }

    public void setFixedBudget(int fixedBudget) {
        this.fixedBudget = fixedBudget;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public String[] getHistoryOfPurchases() {
        return HistoryOfPurchases;
    }

    public void setHistoryOfPurchases(String[] historyOfPurchases) {
        HistoryOfPurchases = historyOfPurchases;
    }

    /**
     * Method for throwing an exception if the Green Bonus Program's budget is less than 10000.
     */

    public int handleBonusRequest() throws IllegalArgumentException {
        CarDealership carDealership = new CarDealership();
        if (totalSum >= 10000) {
            System.out.println("\nCustomer receives bonus of: " + fixedBudget);
        } else {
            if (totalSum < 10000) {
                throw new IllegalArgumentException("There are no more bonuses.");
            }
        }
            return fixedBudget;
    }
}