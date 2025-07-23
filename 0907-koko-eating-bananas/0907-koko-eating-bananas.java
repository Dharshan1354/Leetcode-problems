class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int len = piles.length;
        
        int left = 1;
        int right = 0;
        for (int i = 0; i < len; i++) {
            right = Math.max(right, piles[i]);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int timetaken = 0;
            for (int i = 0; i < len; i++) {
                timetaken += Math.ceil((double) piles[i] / mid);
            }

            if (timetaken > h) {
                left = mid + 1; // speed too slow, increase it
            } else {
                ans = mid;       // possible answer, try smaller
                right = mid - 1;
            }
        }

        return ans;
    }
}
