class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        //find the left maximum building and store them
        int max = -1;
        for(int i=0; i<len; i++){
            if(max < height[i])
                max = height[i];
            left[i] = max;
        }
        //redeclare max and find the right maximum building and store them
        max = -1;
        for(int i=len-1; i>=0; i--){
            if(max < height[i])
                max = height[i];
            right[i] = max;
        }

        int total = 0;
        for(int i=0; i<len; i++){
            total += Math.min(left[i], right[i]) - height[i];
        }
        return total;
    }
}