package recursion;
import java.util.Stack;

public class reverseStack {
    public static void reverse(Stack<Integer>st){
        if(st.empty()) {
           return;
        };
        int temp = st.pop();
        reverse(st);
        insertAtBottom(st,temp);
    }
    public static void insertAtBottom(Stack<Integer> st,int val){
        if(st.empty()){
            st.push(val);
            return;
        }
        int temp = st.pop();
        insertAtBottom(st, val);
        st.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        reverse(st);
        System.out.println(st);
    }
}
