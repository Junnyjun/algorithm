class Solution {
    fun isHappy(n: Int): Boolean {
            var r = n
    while (r != 1 && r != 4) r = r.toString().sumBy { (it - '0') * (it - '0') }
    return r == 1
    }
}