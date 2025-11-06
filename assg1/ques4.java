package assg1;

public class ques4 {
    public static boolean isDig(String s, int i) {
        // edge case - if string is empty return false
        if (s.length() == 0)
            return false;
        // base case - reached the end of the string
        if (i == s.length()) {
            return true;
        }
        // logic - if curr char is not digit return false
        if (!Character.isDigit(s.charAt(i))) {
            return false;
        }
        return isDig(s, i + 1);

    }

    public static void main(String[] args) {
        String s = "1234";
        System.out.println("is digits only : " + isDig(s, 0));
    }
}
