// https://www.youtube.com/watch?v=FEkZxCl_-ik

class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0 || s.charAt(0) == '0') return 0;

        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n ; i++){
            int onedigit = Integer.parseInt(s.substring(i-1, i));
            int twodigit = Integer.parseInt(s.substring(i-2, i));

            if(onedigit >= 1)
                dp[i] = dp[i] + dp[i-1];

            if(twodigit >= 10 && twodigit <= 26)
                dp[i] = dp[i] + dp[i-2];
        } 
        return dp[n];
    }
}