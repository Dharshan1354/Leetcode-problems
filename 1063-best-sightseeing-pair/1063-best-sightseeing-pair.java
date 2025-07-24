class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int first = values[0];
        int second;
        int max = 0;
        for(int i = 1; i < values.length; i++){

            second = values[i] - i;

            max = Math.max(max, first + second);
            first = Math.max(first, values[i] + i);
        }
        return max;
    }
}