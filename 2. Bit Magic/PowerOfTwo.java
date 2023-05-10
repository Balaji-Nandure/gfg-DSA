public class PowerOfTwo {
    // Naive
    // divide number by 2 repetatively, if reminder != 0 return false , otherwise
    // return true
    // TC = O(logn)
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            // check if reminder is not zero
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    // pro
    // the numbers with power of two has only one set bit
    // use bians algorithma to find number of set bits. if 1 - return true, else
    // return false

    public static void main(String[] args) {

        System.out.println(isPowerOfTwo(8));
    }
}
