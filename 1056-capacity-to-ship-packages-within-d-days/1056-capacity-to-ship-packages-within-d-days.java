class Solution {
    public static int calculate(int[] weights, int curr){
        int days = 1;
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            if(sum > curr){
                days++;
                sum = weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int minweight = 0;
        int maxweight = 0;
        int total = 0, max = 0;
        for(int i = 0; i < weights.length; i++){
            total += weights[i];
            max = Math.max( max, weights[i]); 
        }
        minweight = max;
        maxweight = total;
        int ans = 0;
        while(minweight <= maxweight)
        {
            int currcapacity = minweight + (maxweight - minweight) / 2;
            int numofDays = calculate(weights, currcapacity);

            if(numofDays > days){
                minweight = currcapacity + 1;
            }
            else{
                ans = currcapacity;
                maxweight = currcapacity - 1;
            }
        }
        return ans;
    }
}