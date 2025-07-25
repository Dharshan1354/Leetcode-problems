class Solution {
    public int subarraySum(int[] nums, int k) {
        // Map to store how many times a prefix sum has occurred
        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); // Base case: one way to get sum = 0

        int currentSum = 0; // Tracks the prefix sum at each step
        int totalCount = 0; // Stores the total count of subarrays that sum to k

        for (int num : nums) {
            currentSum += num; // Update the running prefix sum

            // Check if there's a previous prefix sum that would make a subarray sum to k
            int required = currentSum - k;

            if (prefixSumFreq.containsKey(required)) {
                totalCount += prefixSumFreq.get(required);
            }

            // Update the frequency of the current prefix sum
            prefixSumFreq.put(currentSum, prefixSumFreq.getOrDefault(currentSum, 0) + 1);
        }

        return totalCount;
    }
}
