import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsCalculatorTest {

    private static SumCalculator sumCalculator;

    @BeforeAll
    public static void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumPositiveNumber() {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int result = sumCalculator.calculateSum(list);
        assertEquals(15,result);
    }

    @Test
    public void testSumNegativeNumber() {
        List<Integer> list = Arrays.asList(-1,-2,-3,-4,-5);
        int result = sumCalculator.calculateSum(list);
        assertEquals(-15,result);
    }

    @Test
    public void testSumZeroNumber() {
        List<Integer> list = Arrays.asList(0,0);
        int result = sumCalculator.calculateSum(list);
        assertEquals(0,result);
    }
}