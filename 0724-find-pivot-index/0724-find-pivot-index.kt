class Solution {
  fun pivotIndex(nums: IntArray): Int {
    if (nums.isEmpty()) {
      return -1
    }
    val sum = nums.sum()
    var sumLeft = 0
    var sumRight = sum
    
    return nums.indices.find { i ->
      sumLeft += nums.getOrElse(i - 1, {0})
      sumRight -= nums[i]
      sumLeft == sumRight
    } ?: -1
  }
}