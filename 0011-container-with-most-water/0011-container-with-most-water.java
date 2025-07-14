class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = -1;
        while(start < end){
            int count = end - start;
            max = Math.max(max, (count * Math.min(height[start], height[end])));
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return max;
    }
}