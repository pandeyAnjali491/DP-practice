package assg3;
import java.util.*;
public class movebrackets {

    static int count=0;
    public static void countMoves(char arr[],int i,int j){
        if(isValid(arr)){
            return;
        }
        if(i>=j) {
            return;
        }
        if(arr[i]==')' && arr[j]=='('){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            count++;
        }
        if(arr[i]=='('){
            countMoves(arr, i+1, j);
        }
        if(arr[j]==')'){
            countMoves(arr,i, j-1);
        }
    }
    public static boolean isValid(char arr[]){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==')' && st.empty()){
                return false;
            }
            if(arr[i]=='('){
                st.push(arr[i]);
            }
            else if(arr[i]==')'){
                st.pop();
            }
        }
        if(st.empty()) return true;

        return false;
    }
    public static void main(String[] args) {
        String str = ")))((((())";
        char arr[] = str.toCharArray();
        countMoves(arr,0,arr.length-1);
        System.out.println(count);
    }
}