package ro.siit.evprogram;

public class GreenBonusProgram {
    private int fixedBudget = 10000;
    private String[] historyOfPurchases;
    private int totalSum = 10000000;

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
}
