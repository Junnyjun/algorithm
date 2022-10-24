class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
                val result = intArrayOf(-1,-1)
     if(nums.isEmpty()){
            return result
        }
        
        var start = 0
        var end = nums.size - 1
        var mid = 0
        
        while (start <= end) {
            mid = (start + end) / 2
            if (nums[mid] == target) {
                break
            } else if (nums[mid] < target) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        if (nums[mid] != target) {
            return result
        }
        var left = mid
        var right = mid
        while (left >= 0 && nums[left] == target) {
            left--
        }
        while (right < nums.size && nums[right] == target) {
            right++
        }
        result[0] = left + 1
        result[1] = right - 1
        return result
    }
}