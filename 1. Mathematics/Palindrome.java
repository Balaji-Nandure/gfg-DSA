
// a number from left to right = number from right to left
public class Palindrome {

    private static boolean palindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            System.out.println(reverse);
            temp = temp / 10;
        }

        return n == reverse;
    }

    public static void main(String[] args) {
        System.out.println(palindrome(9559));
    }

}
