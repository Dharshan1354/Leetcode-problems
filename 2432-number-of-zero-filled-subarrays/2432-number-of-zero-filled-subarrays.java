class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long streak = 1;
        long count = 0;
        for(int n : nums){
            if(n == 0){
                count += streak;
                streak++;
            }
            else
                streak = 1;
        }
    return count;
    }
}