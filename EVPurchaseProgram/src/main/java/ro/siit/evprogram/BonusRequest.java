package ro.siit.evprogram;

/**
 * Method for throwing an exception if the Green Bonus Program's budget is less than 10000.
 */

public class BonusRequest {

    GreenBonusProgram g = new GreenBonusProgram();

    public int handleBonusRequest() throws IllegalArgumentException {
        if (g.getTotalSum() < 10000) {
            throw new IllegalArgumentException("The Green Bonus Program budget should be more than 10000.");
        }
        return g.getFixedBudget();
    }

}
