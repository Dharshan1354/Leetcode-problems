class Solution {
    public int averageValue(int[] nums) {
        int count = 0, ans = 0;
        for(int num: nums){
            if(num % 2 == 0 && num % 3 == 0){
                ans = ans + num;
                count++;
            }
        }
        if(count == 0)
            return 0;
        return ans/count;
    }
}