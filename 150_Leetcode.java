import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int res = 0;

        for(String s : tokens){
            if(s.equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.add(b+a);
            }
            else if(s.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.add(b-a);
            }
            else if(s.equals("*")){
                int a = st.pop();
                int b = st.pop();
                st.add(b*a);
            }
            else if(s.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.add(b/a);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}