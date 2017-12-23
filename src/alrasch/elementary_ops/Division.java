package alrasch.elementary_ops;

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
}
