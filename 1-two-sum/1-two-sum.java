class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
              if(i != j){
               sum = nums[i] + nums[j];
               if(sum == target){
                 return new int[]{i,j};
               }
              }
              
            }
        }
        return null;
    }
}