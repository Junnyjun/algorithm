class Solution {
    public int maxSubArray(int[] nums) {
            int len = nums.length;
    int max = nums[0];
    int localMax = nums[0];
    for(int i=1; i < len; i++){
        localMax = Math.max(localMax+nums[i],nums[i]);   //현재 index에서의 가장 큰 값
        max = Math.max(localMax,max); // 각 인덱스의 최대값들 중에 가장 큰 값
    }
    return max;
    }
}