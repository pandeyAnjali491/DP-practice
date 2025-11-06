package assg1;

public class ques5 {

    public static int countZero(int n, int count) {
        // base case - if num becomes zero return count
        if (n == 0) {
            return count;
        }
        // logic - if remainder of curr num is 0 then count++
        int dig = n % 10;
        if (dig == 0) {
            return countZero(n / 10, count + 1);
        }
        return countZero(n / 10, count);
    }

    public static void main(String[] args) {
        int num = 102030;
        int totalZeros = 0;
        // edge case if num is zero then ans is 1
        if (num == 0) {
            totalZeros = 1;
        } else {
            totalZeros = countZero(num, 0);
        }
        System.out.println("total zero: " + totalZeros);
    }

}
