package assg1;

public class ques6 {
    public static int decToBin(int n, int i, int res) {
        // base case
        if (n == 0)
            return res;
        // logic - divide by 2 store the remainder and save it in the way that it get reversed
        int rem = n % 2;
        return decToBin(n / 2, i + 1, (int) (res + rem * Math.pow(10, i)));
    }

    public static void main(String[] args) {
        int dec = 60;
        int bin = decToBin(dec, 0, 0);
        System.out.println(bin);
    }
}
