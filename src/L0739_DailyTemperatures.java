import java.util.Stack;

public class L0739_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack();
        int len = temperatures.length;
        int[] res = new int[len];

        stack.push(0);
        for(int i = 1; i < len; i ++) {
            int temp = temperatures[i];
            while(!stack.isEmpty() && temp > temperatures[stack.peek()]){
                int preIndex = stack.pop();
                res[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return res;
    }
}
