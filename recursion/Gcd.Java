package recursion;
public class Gcd {
    public static int calGcd(int a,int b){
        if(a%b==0) return b;
        return calGcd(b,a%b); 
    }
    public static void main (String args[]) {
            int a = 12;
            int b = 9;
            if(a>b){
                System.out.println(calGcd(a,b));
            }
            else{
                System.out.println(calGcd(b,a));
            }
    }
}