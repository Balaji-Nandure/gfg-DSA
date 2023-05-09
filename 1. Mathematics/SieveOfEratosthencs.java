// to print all the prime numbers which are smaller than or equal to n
// e.g for 10 = 2,3,5,7
public class SieveOfEratosthencs {
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Naive
    public static void sieveOfEratosthencs(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    // pro
    // ides = make use of boolean array and mark all multiple of prime (2,3,5...) as
    // false

    public static void main(String[] args) {
        sieveOfEratosthencs(99);
    }
}
