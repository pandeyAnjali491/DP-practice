package recursion;

public class towerOfHanoi {
    public static void tower(int n,char s,char i,char d){
        if(n==1){
            System.out.println("move one from "+s+" to "+d);
            return;
        }
        tower(n-1, s, d, i);
        System.out.println("move one from "+s+" to "+d);
        tower(n-1, i, s, d);
    } 
    public static void main(String[] args) {
        tower(3,'s','i','d');
    }
}
