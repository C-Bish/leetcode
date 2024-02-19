import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums, target);

        // Show result
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
        System.out.println("]");
    }

    public static int[] twoSumFirstAttempt(int[] nums, int target) {
        // First solution O(n^2)
         for (int i = 0; i < nums.length; i++) {
             for (int j = i + 1; j < nums.length; j++) {
                 if (nums[i] + nums[j] == target) {
                     return new int[] {i, j};
                 }
             }
         }
         return new int[]{};
    }

    public static int[] twoSum(int[] nums, int target) {
        // Second solution O(n)
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement))
                return new int[] {numToIndex.get(complement), i};
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }

}
