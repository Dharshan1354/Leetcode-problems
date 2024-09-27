class Solution {
    public boolean detectCapitalUse(String word) {
        if(toupper(word) || tolower(word) || start(word))
            return true;
        else
            return false;
    }
    public boolean toupper(String word){
        int count = 0;
        for(int i=0; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
                continue;
            else{
                count++;
                break;
            }
        }
        return count == 0 ? true : false;
    }
    public boolean tolower(String word){
        int count = 0;
        for(int i=0; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch))
                continue;
            else{
                count++;
                break;
            }
        }
        return count == 0 ? true : false;
    }
    public boolean start(String word){
        if(Character.isUpperCase(word.charAt(0))){
        int count = 0;
        String sub = word.substring(1);
        if(tolower(sub))
            return true;
        }
            return false;
    }
}