class Solution {
    public int characterReplacement(String s, int k) {
         int[] chars = new int[26];
        
        int max =0,count=0,start=0;
        
        for(int end =0; end<s.length();end++)
        {
            chars[s.charAt(end) - 'A']++;
            int current = chars[s.charAt(end) - 'A'];
            count = Math.max(count , current);
            
            while(end - start - count +1 > k)
            {
                chars[s.charAt(start) - 'A']--;
                start++;
            }
            max = Math.max(max , end-start+1);
        }
        return max;
    }
    }
