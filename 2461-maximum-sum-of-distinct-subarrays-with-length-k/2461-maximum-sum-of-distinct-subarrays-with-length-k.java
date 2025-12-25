class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long currentSum = 0;
        HashSet<Integer> windowSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // If the current number is already in the set, 
            // shrink the window from the left until the duplicate is removed
            while (windowSet.contains(nums[right])) {
                windowSet.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            // Add the current number
            windowSet.add(nums[right]);
            currentSum += nums[right];

            // If the window exceeds size k, remove the leftmost element
            if (right - left + 1 > k) {
                windowSet.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            // If the window is exactly size k, update the max
            if (right - left + 1 == k) {
                max = Math.max(max, currentSum);
            }
        }
        return max;
    }
}