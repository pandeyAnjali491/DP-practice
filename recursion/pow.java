package recursion;

public class pow {
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
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}
