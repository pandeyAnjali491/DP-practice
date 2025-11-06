package recursion;

public class fibbonacci {
    public static int sum(int n,int res){
        if(n==0) return res;
        int dig = n%10;
        return sum(n/10, res+dig);
    }
    public static int fibo(int n){
        int a =0;
        int b =1;
        for (int i = 2; i <= n; i++) {
            int sum = a+b;
            a=b;
            b=sum;
        }
        return b;
    }
    public static int fiboR(int n,int a,int b){
        if(n==1) return b;
        if(n==0) return a;
        return fiboR(n-1, b, a+b);
    }
    public static void main(String[] args) {
        System.out.println("sum of 543: "+sum(543, 0));
        System.out.println("fibo of "+ fibo(4));
        System.out.println("fibo of "+ fiboR(6,0,1));
    }
}
