package recursion;

public class luckyNO {
     public static int power(int x,int n){
        if(n==1) return x;
        int halfPow = power(x, n/2);
        int res = 1;
        if(n%2==0){
            res = halfPow * halfPow;
        }
        else {
            res = halfPow * halfPow * x;
        }
        return res;
    }
    public static int lucky(int n){
        if(n==1) return 2;
        return lucky(n-1) + power(2,n);
    }
    public static void main(String[] args) {
        System.out.println(lucky(2));
    }
}
