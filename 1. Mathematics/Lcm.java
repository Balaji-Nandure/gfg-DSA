public class Lcm {
    // lcm >= Math.max(a,b)
    // Naive O(a*b - max(a,b))
    public static int lcm(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }
            res++;
        }
    }

    // Pro
    // a*b = gcd(a,b) * lcm(a,b)
    // lcm = a*b / gcd(a,b)

    // Euclidean algorithm (optimised)
    // let b<a, then gcd(a,b) = gcd(a-b,b)
    // tc = O(log(min(a,b)))
    public static int gcd2(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd2(b, a % b);
        }
    }

    public static int lcm2(int a, int b) {
        return a * b / (gcd2(a, b));
    }

    public static void main(String[] args) {
        System.out.println(lcm(4, 6));
        System.out.println(lcm2(4, 6));
    }
}
