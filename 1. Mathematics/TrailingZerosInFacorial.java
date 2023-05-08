public class TrailingZerosInFacorial {
    // Naive
    // calc factorial > calculate zeros
    // tc = o(n)
    public static int countZeros(int n) {
        // count factorial
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

        // count zeros
        int zeros = 0;
        while (fact % 10 == 0) {
            zeros += 1;
            fact /= 10;
        }

        return zeros;
    }

    // pro
    // find number of 2s and 5s in the range > no need to calc 2s > only calc 5s
    // n/5 + n/25 + n/125 ...

    // tc = (1) , sc = (1)
    public static int countZeros1(int n) {
        int zeros = 0;
        for (int i = 5; i <= n; i = i * 5) {
            zeros += (n / i);
        }
        return zeros;

    }

    public static void main(String[] args) {

        // here cannot give number greater than 12
        System.out.println(countZeros(10));

        // pro
        System.out.println(countZeros1(1000));
    }
}
