public class Factorial {
    // tc = o(n) , sp = o(1)
    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // tc = o(n) , sp = o(n)
    public static int factorialRecursive(int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        // System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
    }
}
