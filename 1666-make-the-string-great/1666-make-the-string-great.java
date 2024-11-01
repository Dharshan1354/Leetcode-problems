class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
         for (char ch : s.toCharArray()) {
            // Check if stack is not empty and current char forms a "bad" pair with top of stack
            if (!stk.isEmpty() && Math.abs(stk.peek() - ch) == 32) {
                stk.pop();
            } else {
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: stk)
            sb.append(ch);
        return sb.toString();
    }
}