import java.util.Stack;
// in-order traversal: left, root, right
public class L1130_MinimumCostTreeFromLeafValues {
    public int mctFromLeafValues(int[] arr) {
        int len = arr.length;
        Stack<Integer> stack = new Stack();
        int ans = 0;
        stack.push(Integer.MAX_VALUE);
        for(int i = 0; i < len; i ++) {
            while(stack.peek() <= arr[i]) {
                // drop the value if it is smaller than its both sides
                int drop = stack.pop();
                ans += drop * Math.min(stack.peek(), arr[i]);
            }
            stack.push(arr[i]);
        }
        while(stack.size() > 2) {
            // make the bigger number be used as less as possible
            ans += stack.pop() * stack.peek();
        }
        return ans;
    }
}
