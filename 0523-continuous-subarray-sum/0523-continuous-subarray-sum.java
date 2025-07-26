class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1);  // Important base case

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int mod = (k != 0) ? (sum % k + k) % k : sum; // handle negative mods safely

            if (modMap.containsKey(mod)) {
                if (i - modMap.get(mod) > 1)  // subarray length ≥ 2
                    return true;
            } else {
                modMap.put(mod, i);  // store the first index only
            }
        }

        return false;
    }
}
