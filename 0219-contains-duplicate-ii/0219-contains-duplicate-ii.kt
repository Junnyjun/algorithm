class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
                var li = 0
        var ui = 0
        for (i in 0 until nums.size){
            li = maxOf(i-k, 0)
            ui = minOf(nums.size, i+k)
            for (j in li until ui){
                if (j==i){
                    continue
                }
                if (nums[i] == nums[j]){
                    return true
                }
            }
        }
        return false
    }
}