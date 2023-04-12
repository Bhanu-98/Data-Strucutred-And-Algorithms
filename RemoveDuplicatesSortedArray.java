public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        // Leetcode problem number 80
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] expected = {1, 1, 2, 2, 3, 1};
        int n = removeDuplicates(nums);
    }
    
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
        if (i < 2 || n > nums[i - 2])
            nums[i++] = n;
        return i;
    }
}