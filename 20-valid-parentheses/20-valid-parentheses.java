import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char item;
            if (c == '(' || c == '{' || c == '[') st.push(c);
            else {
                try {
                    item = st.pop();
                } catch (EmptyStackException e){
                    return false;
                }
                if ((c == ')' && item != '(') || (c == '}' && item != '{') || (c == ']' && item != '[')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}