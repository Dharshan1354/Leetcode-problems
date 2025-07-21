class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;
        String str = Integer.toString(num);

        for(int i=0; i<= str.length() - k; i++){
            int val = Integer.parseInt(str.substring(i,i+k));
                if(val != 0 && num % val == 0)
                    count++;
        }
        return count;
    }
}