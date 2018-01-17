package ro.siit.evprogram;

public class BonusController {


    GreenBonusProgram bonus = new GreenBonusProgram();

    public int bonusController() {
        if (bonus.getTotalSum() >= 10000) {
            int bonusReceived = bonus.getFixedBudget();
            System.out.println("Customer receives bonus of: ");
        } else {
            System.out.println("There are no more bonuses");
        }
        return bonus.getFixedBudget();
    }
}

