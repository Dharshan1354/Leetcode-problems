class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curSum = Math.max(nums[i], curSum + nums[i]); // Either extend or start new subarray
            maxSum = Math.max(maxSum, curSum); // Update max found so far
        }
        return maxSum;
    }
}
