import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private SumCalculator calc;

    @BeforeEach
    public void setUp() {
        calc = new SumCalculator();
    }
    @Test
    public void testThatSumWorksCorrectFor1(){
        int actual = calc.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumWorksCorrectFor3(){
        int actual = calc.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumWorksCorrectFor0(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}