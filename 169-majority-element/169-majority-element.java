import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int majorityElement(int[] nums) {
                Map<Integer,Integer> map = new HashMap<>();

        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int max = map.keySet().stream().sorted((a, b) -> map.get(b) - map.get(a))
            .collect(Collectors.toList()).get(0);
        return max;
    }
}