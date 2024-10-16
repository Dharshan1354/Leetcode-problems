class Solution {
    public int removeDuplicates(int[] nums) {
       int newindex = 1;
       for(int i=1; i<nums.length; i++){
            if(nums[i-1] != nums[i]){
            nums[newindex] = nums[i];
            newindex++;
            }
       }
       return newindex;
    }
}