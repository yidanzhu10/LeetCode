import java.util.Stack;

public class L0020_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            // push the pair into the stack
            if(c == '('){
                stack.push(')');
            } else if(c == '{') {
                stack.push('}');
            } else if(c == '['){
                stack.push(']');
            } else {
                //condition: [()]}
                if(stack.isEmpty()) return false;
                char temp = stack.pop();
                // condition: [{]}
                if(c != temp) return false;
            }
        }
        // condition: [()]{
        if(!stack.isEmpty()) return false;
        else{
            return true;
        }
    }
}
