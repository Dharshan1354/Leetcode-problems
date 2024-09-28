class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = (((int)(columnTitle.charAt(0) - 'A')) + 1);
        for(int i =1; i < columnTitle.length(); i++){
            sum *= 26;
            sum += ((int)(columnTitle.charAt(i)-'A')+1);
        }
        return sum;
    }
}