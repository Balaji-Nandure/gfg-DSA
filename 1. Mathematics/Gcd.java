public class Gcd {
    // There is relation with "largest square tile rectangle size for floaring of
    // size a*b " problem
    // tc = O(min(a,b))
    public static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }

        return res;
    }

    // Euclidean algorithm
    // let b<a, then gcd(a,b) = gcd(a-b,b)
    public static int gcd1(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        // both are same
        // return a;
        return b;
    }

    // Euclidean algorithm (optimised)
    // let b<a, then gcd(a,b) = gcd(a-b,b)
    public static int gcd2(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd2(b, a % b);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
        System.out.println(gcd1(4, 6));
        System.out.println(gcd2(4, 6));
    }
}
