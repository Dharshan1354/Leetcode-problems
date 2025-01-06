class Solution {
    public int minimumMoves(String s) {
        int total = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == 'X'){
                i+=3;
                total++;
            }
            else
                i++;
        }
        return total;
    }
}