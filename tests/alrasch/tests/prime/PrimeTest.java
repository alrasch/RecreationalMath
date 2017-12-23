package alrasch.tests.prime;

import alrasch.prime.Prime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeTest {
    @Test
    void primeTestTrue() {
        Prime prime = new Prime();

        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 7919, 21433};

        for (int number : primes) {
            assertTrue(prime.isPrime(number));
        }
    }

    @Test
    void primeTestFalse() {
        Prime prime = new Prime();

        int[] nonPrimes = new int[]{1, 4, 6, 8, 9, 10, 12, 14, 15, 21, 25, 111, 1035, 10023};

        for (int number : nonPrimes) {
            System.out.println(number);
            assertFalse(prime.isPrime(number));
        }
    }
}
