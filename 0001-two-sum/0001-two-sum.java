class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        for(int i =0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    arr[1] = j;
                    arr[0] = i;
                    return arr;
                }
            }
        }
        return new int[]{};
    }
}