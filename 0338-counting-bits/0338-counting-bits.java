class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++){
            res[i] = countone(i);
        }
        return res;
    }

    public int countone(int num){
        int count = 0;
        while(num > 0){
            if((num & 1) == 1)
                count++;
            num = num >> 1;
        }
        return count;
    }
}