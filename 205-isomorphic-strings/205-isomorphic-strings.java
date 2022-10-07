import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) != c1) {
                    return false;
                }
            } else {
                if (map.containsValue(c1)) {
                    return false;
                }
                map.put(c, c1);
            }
        }
        return true;
    }
}