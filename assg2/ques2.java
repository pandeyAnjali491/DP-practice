package assg2;

import java.util.Stack;

public class ques2 {
    public static void remove(Stack<Integer> s,int count,int middle){
        // base case
        if( count == middle ){
            s.pop();
            return;
        }
        // before the middle ele pop all and then add after removing it
        int temp = s.pop();
        remove(s,count-1,middle);
        s.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        int pos = (s.size()+1)/2;
        remove(s,s.size(),pos);
        System.out.println(s);
    }
}
