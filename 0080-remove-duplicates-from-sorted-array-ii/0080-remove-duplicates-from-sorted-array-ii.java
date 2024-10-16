class Solution {
    public int removeDuplicates(int[] nums) {
        int newindex = 2;
        for(int i=2; i<nums.length; i++){
            if(nums[newindex-2] != nums[i]){
                nums[newindex] = nums[i];
                newindex++;
            }
        }
        return newindex;
    }
}