import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class CostCalculatorTest {

    @Test
    public void calculate(){

        int amountOfSMS = 5;
        BigDecimal costOfSms = new BigDecimal(1.5);
        BigDecimal expectedCost = new BigDecimal (7.5);
        CostCalculator costCalculator = new CostCalculator(costOfSms);
        assertEquals(expectedCost, costCalculator.calculate(amountOfSMS));
    }
}