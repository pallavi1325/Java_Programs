package Java;

public class Duplicate_Number {
    public int findDuplicate(int[] nums) {
        // Initialize slow and fast pointers
        int slow = nums[0];
        int fast = nums[0];

        // Move slow and fast pointers until they meet inside the cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Move one pointer to the beginning of the array
        slow = nums[0];

        // Move both pointers at the same pace until they meet at the entrance of the cycle
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        // Return the duplicate number
        return slow;
    }

    public static void main(String[] args) {
        FindDuplicateNumber solution = new FindDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        int duplicateNumber = solution.findDuplicate(nums);
        System.out.println("Duplicate number: " + duplicateNumber);
    }
}
