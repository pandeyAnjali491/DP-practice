package assg1;

public class ques1 {
    public static int totalDig(int n, int count) {
        // edge case - if num is 0 don't return 0 it have 1 digit
        if (n==0 && count==0) {
            return 1;
        }
        // base case - when digits are end
        if (n == 0)
            return count;
        // logic - move to every digit and count it
        return totalDig(n / 10, count + 1);
    }

    public static void main(String[] args) {
        int num = 12345;
        int totalDig = totalDig(num, 0);
        System.out.println("dig in " + num + " are: " + totalDig);
    }
}