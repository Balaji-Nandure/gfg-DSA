// check if kth bit is set or not
public class KthBit {
    // in this method we are using bitmask
    public static void KthBit(int n, int k) {
        int bitMask = 1 << (k - 1);
        if ((n & bitMask) == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    // In this method we are shifting kth bit of n itself to LSB
    public static void KthBit1(int n, int k) {
        int bitMask = n >> (k - 1);
        if ((bitMask & 1) == 1) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        KthBit1(5, 3);
    }
}
