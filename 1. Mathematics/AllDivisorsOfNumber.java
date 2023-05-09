public class AllDivisorsOfNumber {
    // Naive TC = O(n)
    public static void allDivisorsOfNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    // pro TC = sqrt(n)
    // divisors of a pair always appears in pair (x,y) where x*y=n
    // one of the divisor always be smaller than sqrt(n)
    // this code does not print in sorted order
    public static void allDivisorsOfNumber1(int n) {
        // run loop from 1 to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // found first elemet of a pair i.e (x)
                System.out.print(i + ", ");

                // sometimes x=y, to avoid that
                if (i == n / i) {
                    continue;
                }

                // pritn y
                System.out.print(n / i + ", ");
            }
        }
    }

    // for printing in sorted order
    // 💡 idea = Travers two times
    public static void allDivisorsOfNumber2(int n) {
        // run loop from 1 to sqrt(n)-1 (for avoiding x=y condition)
        int i;
        for (i = 1; i * i < n; i++) {
            if (n % i == 0) {
                // print x
                System.out.print(i + ", ");
            }
        }

        // start form sqrt(n)
        // i is not initialised means start from whatever value of i
        for (; i >= 1; i--) {
            if (n % i == 0) {
                // print y
                System.out.print(n / i + ", ");
            }
        }

    }

    public static void main(String[] args) {
        // allDivisorsOfNumber(15);
        // allDivisorsOfNumber1(25);
        allDivisorsOfNumber2(25);
    }
}
