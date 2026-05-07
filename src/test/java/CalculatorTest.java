import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void testSub() {
        assertEquals(0, calculator.sub(2, 2));
    }

    @Test
    public void testMul() {
        assertEquals(4, calculator.mul(2, 2));
    }

    @Test
    public void testDiv() {
        assertEquals(1, calculator.div(2, 2));
    }

    @Test
    public void testDivByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.div(2, 0));
    }

}
