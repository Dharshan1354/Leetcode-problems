class Solution {
    public int addDigits(int num) {
        if(num < 10)
            return num;
        return addDigits(adding(num));
    }
    public int adding(int num){
        int rem = 0;
        while(num>0){
            rem = rem + num %10;
            num /= 10;
        }
        return rem;
    }
}