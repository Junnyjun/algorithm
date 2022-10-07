class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        
        if(s.length == 0) return true
        
        var j = 0
        for(i in 0 until t.length) {
            if(s[j] == t[i]) j++
            if(j == s.length) return true
        }
        
        return false
    }
}