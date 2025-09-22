class Solution {
    public String largestNumber(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length ; j++){
                String left = "" + nums[i] + nums[j];
                String right = "" + nums[j] + nums[i];

                if(right.compareTo(left) > 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int n:nums){
            sb.append(n);
        }
        return sb.toString();
    }
}