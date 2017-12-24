package alrasch.elementary_ops;

import alrasch.common.exceptions.InvalidArgumentException;
import alrasch.prime.Prime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Division {

    public long[] getDivisors(long n, boolean reverse, boolean excludeObvious) {
        ArrayList<Long> divisors = new ArrayList<>();
        divisors.add(1L);
        divisors.add(n);

        if (n % 2 == 0) {
            divisors.add(2L);
            divisors.add(n/2);
        }

        for(int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add((long) i);
                divisors.add(n/i);
            }
        }

        divisors.sort(Comparator.naturalOrder());

        if (reverse) {
            Collections.reverse(divisors);
        }

        if (excludeObvious) {
            divisors.remove(n);
            divisors.remove(1L);
        }

        for (long i : divisors) {
        }

        return divisors.stream().mapToLong(l -> l).toArray();
    }

    public long getSmallestProperDivisor(long n) throws InvalidArgumentException {
        if (n == 1) {
            String message = "Tried to find greatest proper divisor of 1.";
            String explanation = "1 has only one divisor; itself.";
            throw new InvalidArgumentException(message, explanation);
        }

        if (n % 2 == 0) {
            return 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return (long) i;
            }
        }

        Prime prime = new Prime();
        if (prime.isPrime(n)) {
            String message = "Tried to find greatest proper divisor of a prime.";
            String explanation = "A prime has only two divisors; 1 and itself. Both are improper.";
            throw new InvalidArgumentException(message, explanation);
        }

        return n;
    }
}
