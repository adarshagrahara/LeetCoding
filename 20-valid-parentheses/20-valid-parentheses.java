class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
    if(s.length()%2 != 0)
        return false;
    for(int i = 0;i<s.length();i++){
        if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            stack.push(s.charAt(i));
        else if(stack.size() > 0 && s.charAt(i) == ')' && stack.peek() == '(')
            stack.pop();
        else if(stack.size() > 0 && s.charAt(i) == '}' && stack.peek() == '{')
            stack.pop();
        else if(stack.size() > 0 && s.charAt(i) == ']' && stack.peek() == '[')
            stack.pop();
        else 
            return false;
    }
    return stack.size() == 0;
    }
}