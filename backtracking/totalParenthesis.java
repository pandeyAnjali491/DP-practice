package backtracking;

import java.util.ArrayList;
import java.util.Stack;

public class totalParenthesis {
        public static void totalParen(int n, String res,ArrayList<String> visited) {
        if (n==0) {
            if(!visited.contains(res) && isValid(res)){
                System.out.println(res);
                visited.add(res);
            }
            return;
        }
        totalParen(n-1, res + '(',visited);
        totalParen(n-1, res + ')' ,visited);
    }
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && st.empty()){
                return false;
            }
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                st.pop();
            }
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }

    public static int countWellFormed(int n) {
        // add your code here
        ArrayList<String> li = new ArrayList<>();
        totalParen(2*n, "",li);
        return li.size();
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countWellFormed(n));
    }
}
