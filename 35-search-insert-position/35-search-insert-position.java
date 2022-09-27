class Solution {
    public int searchInsert(int[] nums, int target) {
            int start = 0;
    int end = nums.length-1;

    while(start <= end){
        int mid = start + (end-start)/2;
        if(target == nums[mid]){
            return mid;
        }else if(target > nums[mid]){ // 같은 걸 찾기위해 줄여야함
            start = mid+1;
        }else{
            end = mid-1;
        }
    }
    return start;
    }
}