package assg1;

public class ques7 {

    public static int reverse(int n, int res) {
        // base case
        if (n == 0)
            return res;
        // logic - divide by 10 store the remainder
        int rem = n % 10;
        return reverse(n / 10, 10 * res + rem);
    }

    public static void main(String[] args) {
        int dec = 12;
        int bin = reverse(dec, 0);
        System.out.println(bin);
    }
}
