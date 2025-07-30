class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n < 2)
            return nums[0];

        int[] skipfirsthouse = new int[n - 1];
        int[] skiplasthouse = new int[n - 1];

        for(int i = 0; i < n - 1 ; i++){
            skipfirsthouse[i] = nums[i];
            skiplasthouse[i] = nums[i+1];
        }
        int answerskiplasthouse = loot(skiplasthouse);
        int answerskipfirsthouse = loot(skipfirsthouse);
        
        return Math.max(answerskipfirsthouse, answerskiplasthouse);
    }
    public static int loot(int[] arr){
        int n = arr.length;
        if(arr == null || n < 1)
            return 0;

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = arr[0];

        for(int i = 2; i <= n; i++){
            dp[i] = Math.max(dp[i-1] , dp[i-2] + arr[i-1]);
        }
        return dp[n];
    }
}