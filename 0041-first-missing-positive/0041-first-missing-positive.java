class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correct_index = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[correct_index])
                swap(nums, i, correct_index);
            else 
                i++;
        }

        for(int j = 0; j < n; j++){
            if(nums[j] != j+1)
                return j+1;
        }
        return n+1;

    }
    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}