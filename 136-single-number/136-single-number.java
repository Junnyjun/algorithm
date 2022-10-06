class Solution {
    public int singleNumber(int[] nums) {
            int len = nums.length;
    if(len == 1) return nums[0];

    for (int i = 1; i < len ; i++) {
        nums[i] = nums[i-1]^nums[i];
    }

    return nums[len-1];
    }
}