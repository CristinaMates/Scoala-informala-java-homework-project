package ro.siit.evprogram;

public class GreenBonusProgram implements Runnable {
    private int fixedBudget = 10000;
    private String[] HistoryOfPurchases;
    private int totalSum = 1000000;
    private Request request;

    public GreenBonusProgram(Request req) {
        request = req;
    }

    public GreenBonusProgram() {

    }

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

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * Method for throwing an exception if the Green Bonus Program's budget is less than 10000.
     */

    public int handleBonusRequest() throws IllegalArgumentException {
        if (getTotalSum() < 10000) {
            throw new IllegalArgumentException("The Green Bonus Program budget should be more than 10000.");
        }
        return getFixedBudget();
    }

    public void run() {

        int numberOfRequests = totalSum / fixedBudget;
        for (int i = 1; i <= numberOfRequests; i++) {
            int value = request.receive();
            System.out.println(Thread.currentThread().getName() + ": Receive request:" + value);
        }
    }
}