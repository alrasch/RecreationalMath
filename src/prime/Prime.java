package prime;

public class Prime {
    public Prime() {}

    public static void main(String[] args) {
        Prime p = new Prime();
        System.out.println(p.isPrime(5));
    }

    public boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        if (n % 2 == 0 || n == 3) {
            return true;
        }

        for (int i = 3; i <= Math.ceil(Math.sqrt(n)) + 1; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
