class Solution {
    public int singleNumber(int[] nums) {
        for(int n:nums){
            if(threecount(n, nums))
                return n;
        }
        return -1;
    }
    public static boolean threecount(int n, int[] nums){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == n)
                count++;
        }
        if(count == 3)
            return false;
        return true;
    }
}