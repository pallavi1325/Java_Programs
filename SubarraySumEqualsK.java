package Java;
import java.util.*;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // Create a hashmap to store cumulative sums and their frequencies
        Map<Integer, Integer> sumFrequencyMap = new HashMap<>();
        // Initialize variables
        int count = 0;
        int sum = 0;

        // Add initial frequency for sum = 0
        sumFrequencyMap.put(0, 1);

        // Iterate through the array
        for (int num : nums) {
            // Calculate cumulative sum
            sum += num;
            // Check if there exists a subarray with sum = sum - k
            if (sumFrequencyMap.containsKey(sum - k)) {
                count += sumFrequencyMap.get(sum - k);
            }
            // Increment the frequency of the current cumulative sum
            sumFrequencyMap.put(sum, sumFrequencyMap.getOrDefault(sum, 0) + 1);
        }

        // Return the total count of continuous subarrays
        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        int[] nums = {1, 1, 1};
        int k = 2;
        int totalCount = solution.subarraySum(nums, k);
        System.out.println("Total number of continuous subarrays with sum " + k + ": " + totalCount);
    }
}
