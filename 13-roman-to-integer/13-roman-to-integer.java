class Solution {
      int res = 0;
    
    public int romanToInt(String s) {
        
        // minus object
        String[] r = { "IV", "IX", "XL", "XC", "CD", "CM" };
        int[] v = { 4, 9, 40, 90, 400, 900 };
        
        for(int i=0; i<6; i++) {
            s = replaceRoman(s, r[i], v[i]);
        }
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'I') res += 1;
            else if(c == 'V') res += 5;
            else if(c == 'X') res += 10;
            else if(c == 'L') res += 50;
            else if(c == 'C') res += 100;
            else if(c == 'D') res += 500;
            else if(c == 'M') res += 1000;
        }
        return res;
    }
    
    public String replaceRoman(String s, String keyword, int val) {
        while(s.indexOf(keyword) != -1) {
            res += val;
            s = s.replace(keyword, "");
        }
        return s;
    }
}