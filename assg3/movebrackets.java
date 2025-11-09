package assg3;
import java.util.*;
public class movebrackets {

    public static int countMoves(String s,int i,int balance,int moves){
        // base case
        if(i==s.length()){
            return moves;
        }
        char curr = s.charAt(i);
        if(curr=='('){
            balance++;
        }
        else{
            balance--;
        }
        if(balance<0){
            moves++;
            balance=0;
        }
        return countMoves(s, i+1, balance, moves);
    }
    public static void main(String[] args) {
        String str = ")))((((())";
        int moves = countMoves(str,0,0,0);
        System.out.println(moves);
    }
}