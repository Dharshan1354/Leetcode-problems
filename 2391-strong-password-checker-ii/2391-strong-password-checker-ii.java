class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int len = password.length();
        if(len < 8)
            return false;
        int count = 0;
        for(int i=0; i<len; i++){
            char ch = password.charAt(i);
            if(ch > 64 && ch < 91){
                count++;
                break;
            } 
        }
        for(int i=0; i<len; i++){
            char ch = password.charAt(i);
            if(ch > 96 && ch < 123){
                count++;
                break;
            } 
        }
        for(int i=0; i<len; i++){
            char ch = password.charAt(i);
            if(ch > 47 && ch < 58){
                count++;
                break;
            } 
        }
        for(int i=0; i<len; i++){
            char ch = password.charAt(i);
            if(ch == '!' || ch == '@' ||ch == '#' ||ch == '$' ||ch == '%' ||ch == '^' ||ch == '&' ||ch == '*' ||ch == '(' ||ch == ')' ||ch == '-' ||ch == '+'){
                count++;
                break;
            } 
        }
        for(int i=1; i<len; i++){
            char ch = password.charAt(i);
            if(ch == password.charAt(i-1)){
                return false;
            } 
        }
        if(count == 4)
            return true;
        return false;
    }
}