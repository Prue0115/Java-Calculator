import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ScientificCalculatorTest {

    ScientificCalculator sciCalc;  

    @BeforeEach
    void setUp() {
        sciCalc = new ScientificCalculator();
        sciCalc.setNumbers(3, 2); 
    }

    @Test
    void power() {
        assertEquals(9, sciCalc.power());
    }
}