//import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){assertEquals(7, calculator.add(3, 4));}

    @Test
    public void canSubtract(){assertEquals(3, calculator.subtract(7, 4));}

    @Test
    public void canMultiply(){assertEquals(12, calculator.multiply(3, 4));}

    @Test
    public void canDivide(){
        double expected = 4.00;
        double actual = calculator.divide(12.00, 3.00);
        double delta = 0.001;
        assertEquals(expected, actual, delta);
    }
}
