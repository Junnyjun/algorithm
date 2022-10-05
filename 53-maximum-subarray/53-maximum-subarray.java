class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int max = nums[0];
        int localMax = nums[0];
        for(int i=1; i < len; i++){
        localMax = Math.max(localMax+nums[i],nums[i]);   
        max = Math.max(localMax,max); 
        }
    return max;
    }
}