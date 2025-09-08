class Solution {
    public void moveZeroes(int[] nums) {
        int st = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[st] = nums[i];
                st++;
                count++;
            }
        }
        int index = nums.length - count;
        while(index > 0){
            nums[st] = 0;
            st++;
            index--;
        }
    }
}