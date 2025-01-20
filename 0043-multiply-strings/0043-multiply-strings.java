class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int row = num1.length();
        int col = num2.length();
        int tot = row+col;
        int[] res = new int[tot];
        for(int i=row-1; i>=0; i--){
            for(int j=col-1; j>=0; j--){
                int ans = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                ans = ans + res[i+j+1];
                res[i+j+1] = ans % 10;
                res[i+j] = res[i+j] + (ans/10);
            }
       }
        StringBuilder sb = new StringBuilder();
        for(int i=(res[0] == 0)?1:0; i<tot; i++){
            sb.append(res[i]);
       }
       return sb.toString();
    }
}