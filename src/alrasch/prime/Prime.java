package alrasch.prime;

import java.util.ArrayList;

public class Prime {
    private ArrayList<Long> primes;

    public Prime() {
        this.primes = new ArrayList<>();
    }

    private void init() {
        if (this.primes.size() == 0) {
            this.primes.add(2L);
        }
    }

    /**
     * Generates the next prime in this.primes
     */
    private void generateNext() {
        this.init();

        long last = this.primes.get(this.primes.size() - 1);
        if (last == 2) {
            this.primes.add(3L);
            return;
        }

        last += 2;

        while (!isPrime(last)) {
            last += 2;
        }
        this.primes.add(last);
    }

    public long getNthPrime(int n) {
        this.init();
        while (this.primes.size() < n) {
            this.generateNext();
        }
        return this.primes.get(this.primes.size()-1);
    }

    public boolean isPrime(long n) {
        if (n == 2 || n == 3) {
            return true;
        }

        if (n == 1 || n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.ceil(Math.sqrt(n)) + 1; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
