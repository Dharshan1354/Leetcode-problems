class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid; // Found the target
            } else if (nums[mid] < target) {
                start = mid + 1; // Go right
            } else {
                end = mid - 1; // Go left
            }
        }

        // If not found, start will be the correct insert position
        return start;
    }
}
