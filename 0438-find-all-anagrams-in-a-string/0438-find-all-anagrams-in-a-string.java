import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<Integer> findAnagrams(String s, String p) {
           List<Integer> result = new ArrayList<>();
        int len1 = s.length();
        int len2 = p.length();
        int[] map = new int[26];
        for (int i = 0; i < len2; i++) {
            map[p.charAt(i)-'a']++;
        }
        int start = 0;
        for (int i = 0; i < len1; i++) {
            map[s.charAt(i)-'a']--;
            if(i-start >= len2){
                map[s.charAt(start++)-'a']++;
            }
            if(isAllZero(map)){
                result.add(start);
            }
        }
        return result;
    }

    private boolean isAllZero(int[] map){
        for (int i = 0; i <map.length ; i++) {
            if(map[i] != 0) return false;
        }
        return true;
    }   
    }
