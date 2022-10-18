import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
                Stack<String> queue = new Stack<>();
        String[] split = s.split("");
        for (String s1 : split) {
            if (s1.equals("#")) {
                if (!queue.isEmpty()) {
                    queue.pop();
                }
            } else {
                queue.push(s1);
            }
        }
        String s1 = String.join("", queue);

        queue.removeAll(queue);
        String[] split1 = t.split("");
        for (String s2 : split1) {
            if (s2.equals("#")) {
                if (!queue.isEmpty()) {
                    queue.pop();
                }
            } else {
                queue.push(s2);
            }
        }
        String s2 = String.join("", queue);

        return s1.equals(s2);
    }
}