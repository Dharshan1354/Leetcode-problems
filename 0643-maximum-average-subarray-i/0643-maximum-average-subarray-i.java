class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double total = 0;
        for(int i=0; i < k; i++){
            total += nums[i];
        }
        double max = total / k;
        for(int i=k; i<nums.length; i++){
            total = total + nums[i] - nums[i-k];
            double avg = total / k;
            max = Math.max( max, avg);
        }
        return max;
    }
}