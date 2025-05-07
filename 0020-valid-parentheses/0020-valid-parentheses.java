class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else{
                if(stack.isEmpty())
                    return false;
                char temp = stack.peek();
                if(temp == '(' && ch == ')' || temp == '[' && ch == ']' || temp == '{' && ch == '}')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}