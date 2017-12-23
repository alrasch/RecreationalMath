package alrasch.tests.elementary_ops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import alrasch.elementary_ops.Division;

public class DivisionTest {
    @Test
    void testGetDivisors() {
        long[] numbers = {
                1924712L
        };

        long[][] expectations = {
                {1L, 2L, 4L, 8L, 240589L, 481178L, 962356L, 1924712L}
        };

        Division d = new Division();

        for (int i = 0; i < numbers.length; i++) {
            assertArrayEquals(expectations[i], d.getDivisors(numbers[i], false, false));
        }
    }
}

