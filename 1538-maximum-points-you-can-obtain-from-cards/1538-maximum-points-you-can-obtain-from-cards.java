class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int windowsum = 0;
        for(int i=0; i<k; i++){
            windowsum += cardPoints[i];
        }
        int max = windowsum;
        windowsum = 0;
        for(int i=len-k; i<len; i++){
            windowsum += cardPoints[i];
            max = Math.max(windowsum, max);
        }
        int start = 0;
        for(int i=len-k + 1; i<len; i++){

            windowsum += cardPoints[start] - cardPoints[i- 1];
            max = Math.max(windowsum, max);
            start++;
        }
        return max;
    }
}