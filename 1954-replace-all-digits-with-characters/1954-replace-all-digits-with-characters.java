class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                sb.append(ch);
            }
            else{
                int shift = s.charAt(i) - '0';
                char temp = (char)(s.charAt(i-1) + shift);
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}