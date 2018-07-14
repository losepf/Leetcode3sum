import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        return Arrays.asList(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
    }
}
