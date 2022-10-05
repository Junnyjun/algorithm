import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
    int[] collect = Arrays.stream(nums)
        .distinct().toArray();

    return nums.length != collect.length;
    }
}