package alrasch.tests.prime;

import alrasch.prime.Prime;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeTest {
    @Test
    void primeTestTrue() {
        Prime prime = new Prime();

        long[] primes = new long[]{2L, 3L, 5L, 7L, 11L, 13L, 7919L, 21433L};

        for (long number : primes) {
            assertTrue(prime.isPrime(number));
        }
    }

    @Test
    void primeTestFalse() {
        Prime prime = new Prime();

        long[] nonPrimes = new long[]{
                1L, 4L, 6L, 8L, 9L,
                10L, 12L, 14L, 15L, 21L, 25L,
                111L, 1035L, 10023L,
                5915587279L, 92233720368547707L
        };

        for (long number : nonPrimes) {
            assertFalse(prime.isPrime(number));
        }
    }

    @Test
    void testGetNthPrime() {
        Prime prime = new Prime();

        Map<Integer, Long> map = new HashMap<>();
        map.put(1, 2L);
        map.put(2, 3L);
        map.put(1000, 7919L);

        for (int key : map.keySet()) {
            assertEquals((long) map.get(key), prime.getNthPrime(key));
        }
    }
}
