class Solution {
    public boolean judgeSquareSum(int c) {
        int sqrt = (int)Math.sqrt(c);
        if(sqrt*sqrt == c)
            return true;

        int start = 0;
        int end = (int)Math.sqrt(c);
        while(start <= end){
            long sum = (long)(start*start) + (long)(end*end);
            if(sum < c)
                start++;
            else if(sum > c)
                end--;
            else
                return true;
        }
        return false;
    }
}