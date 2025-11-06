package recursion;
class questions{
    public static void printNTo1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNTo1(n-1);
    }
    public static void print1ToN(int n){
        if(n==0){
            return;
        }
        print1ToN(n-1);
        System.out.print(n+" ");
    }
    public static int fibo(int n){
        if(n==0 || n==1) return n;
        int res = fibo(n-1)+fibo(n-2);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("print n to 1");
        printNTo1(5);
        System.out.println("\n print 1 to n");
        print1ToN(5);
        System.out.print("\n fibo sum is: "+fibo(5));


    }
}