import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> val  = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    val.add(nums1[i]);
                    nums1[i] = -2147;
                    nums2[j] = -2149;
                }
            }
        }
        return val.stream().mapToInt(i->i).toArray();
    }
}