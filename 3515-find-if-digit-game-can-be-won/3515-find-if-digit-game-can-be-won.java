class Solution {
    public boolean canAliceWin(int[] nums) {
        if(nums.length == 0)
            return false;

        int total = 0, Asum = 0;
        for(int num:nums){
            total+= num;
            if(num / 10 == 0){
                Asum+= num;
            }
        }
        int Bsum = total - Asum;
        return (Asum != Bsum) ;
    }
}