package alrasch.tests.elementary_ops;

import alrasch.common.exceptions.InvalidArgumentException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void testGetSmallestProperDivisor() throws InvalidArgumentException {
        Division d = new Division();

        long[] numbers = {
                4L, 6L, 9L, 15L, 35L, 77L, 121L
        };

        long[] expectations = {
                2L, 2L, 3L, 3L, 5L, 7L, 11L
        };

        for (int i = 0; i < numbers.length; i++) {
            assertEquals(expectations[i], d.getSmallestProperDivisor(numbers[i]));
        }
    }
}

