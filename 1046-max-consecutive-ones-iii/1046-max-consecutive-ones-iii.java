class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0, zero = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 0)
                zero++;

            while(zero > k){
                if(nums[left] == 0){
                    --zero;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}