class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                count++;
            }

            if (hm.containsKey(sum - k)) {
                count += hm.get(sum - k);
            }

            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
