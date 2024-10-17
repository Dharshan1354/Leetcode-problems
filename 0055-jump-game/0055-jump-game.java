class Solution {
    public boolean canJump(int[] nums) {
        int left = nums[0];
        for(int i=1; i<nums.length; i++){
            left--;
            if(left < 0)    return false;
            if(left == nums.length - 1) return true;
            if(left < nums[i])
                left = nums[i];
        }
        return true;
    }
}