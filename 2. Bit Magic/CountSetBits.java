public class CountSetBits {
    // Naive
    // idea = check last bit -> change result -> rightshift n once untill n =0
    public static int countSetBits(int n) {
        int res = 0;
        while (n > 0) {
            // check last bit, if it is 1 , increment result
            if ((n & 1) == 1) {
                res++;
            }
            // rightshift n once
            n = n / 2;
        }
        return res;
    }

    // Pro
    // Brian cunningham algorithm
    // Traverse only through the set bits
    public static int countSetBits1(int n) {
        int res = 0;
        while (n > 0) {
            n = n & (n - 1);
            res = res + 1;
        }
        return res;
    }

    // Pro 2.0
    // Lookup table solution

    public static void main(String[] args) {
        System.out.println(countSetBits(5));
    }
}
