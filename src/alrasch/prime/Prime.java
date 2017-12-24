package alrasch.prime;

public class Prime {
    public Prime() {}

    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.isPrime(5));
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
