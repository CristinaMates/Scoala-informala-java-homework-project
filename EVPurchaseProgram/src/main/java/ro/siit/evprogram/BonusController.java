package ro.siit.evprogram;

public class BonusController {

    GreenBonusProgram bonus = new GreenBonusProgram();
    int bonusReceived = 0;

    public int bonusController() {
        if (bonus.getTotalSum() >= 10000) {
            bonusReceived = bonus.getFixedBudget();
            System.out.println("Customer receives bonus of: ");
        } else {
            System.out.println("There are no more bonuses of: ");
        }
        return bonus.getFixedBudget();
    }
}

