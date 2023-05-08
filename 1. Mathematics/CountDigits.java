public class CountDigits {

    private static int countDigits(int n) {
        int res = 0;
        while (n > 0) {
            res++;
            n /= 10;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        countDigits(123456);
    }
}