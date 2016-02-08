import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void shouldReturnItselfWhenAddedToZero() {

        Calculator calculator = new Calculator(5,0);

        Assert.assertEquals(5, calculator.add(5, 0), 0);

    }




}
