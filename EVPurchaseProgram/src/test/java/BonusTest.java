import org.junit.Assert;
import org.junit.Test;
import ro.siit.evprogram.GreenBonusProgram;

public class BonusTest {

    @Test
    public void bonusTest() {
        GreenBonusProgram gb = new GreenBonusProgram();
        int programBudget = 10000000;

        if (programBudget >= 10000) {
            int bonusReceived = gb.getFixedBudget();
            System.out.println("Customer receives bonus of: " + gb.getFixedBudget());
        } else {
            System.out.println("There are no more bonuses");
        }
        Assert.assertTrue(programBudget >= 10000);
    }
}
