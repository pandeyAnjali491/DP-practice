package dp;

import java.util.Scanner;

public class diceRolling {
    public static void main(String[] args) {
        int testcase;
        Scanner sc = new Scanner(System.in);
        testcase = sc.nextInt();
        for(int i=1;i<=testcase;i++){
            int n;
            n = sc.nextInt();
            System.out.println(minRoll(n));
        }
    }
    public static int minRoll(int n){
        return (int)Math.ceil(n/7.0);
    }
}
