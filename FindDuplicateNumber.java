package Java;

import java.util.*;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        // If no duplicate is found
        return -1;
    }

    public static void main(String[] args) {
        FindDuplicateNumber solution = new FindDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        int duplicateNumber = solution.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicateNumber);
    }
}

