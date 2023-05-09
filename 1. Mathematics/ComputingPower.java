// find x raise to power n
public class ComputingPower {
    // naive tc = o(n)
    public static int computingPower(int x, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * x;
        }
        return res;
    }

    // pro TC = O(logN) -> recursive solution
    public static int computingPower1(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = computingPower1(x, n / 2);
        temp = temp * temp;
        if (n % 2 == 0) {
            return temp;
        } else {
            return temp * x;
        }
    }

    public static void main(String[] args) {
        computingPower(2, 3);
    }
}
