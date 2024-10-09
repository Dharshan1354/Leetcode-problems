class Solution {
    public int minAddToMakeValid(String s) {
        int len = s.length();
        int left = 0;
        int right = 0;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == '('){
                left++;
            }
            else 
            if(left > 0)
                left--;
            else
                right++;
        }
        return left+right;    
    }
}