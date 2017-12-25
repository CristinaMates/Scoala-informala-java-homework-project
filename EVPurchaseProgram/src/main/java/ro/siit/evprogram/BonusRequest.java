package ro.siit.evprogram;

public class BonusRequest {

    GreenBonusProgram g = new GreenBonusProgram();

    public int bonus() throws IllegalArgumentException {
        if (g.getTotalSum() < 10000) {
            throw new IllegalArgumentException("The budget should be more than 10000.");
        }
        return g.getFixedBudget();
    }

}
