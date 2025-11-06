package recursion;

import java.util.Stack;

public class stacksort {
    public static void sort(Stack<Integer> st){
        if(st.empty()) return ;
        int top = st.pop();
        sort(st);
        insert(st,top);
    }
    public static void insert(Stack<Integer> st,int top){
        if (st.empty() || st.peek()<=top) {
            st.push(top);
            return;
        }
        int last = st.pop();
        insert(st, top);
        st.push(last);
    }
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(5);
        st.push(3);
        st.push(2);
        sort(st);
        System.out.println(st);
    }
}
